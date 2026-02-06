function getLevel(score) {
  if (score <= 5) return "low";
  if (score <= 12) return "medium";
  if (score <= 18) return "high";
  return "critical";
}

async function loadHeatmap() {
  const res = await fetch("/api/risks");
  const risks = await res.json();

  document.querySelectorAll(".cell").forEach(cell => {
    const l = cell.dataset.l;
    const i = cell.dataset.i;

    const count = risks.filter(
      r => r.likelihood == l && r.impact == i
    ).length;

    cell.textContent = count;

    const score = l * i;
    cell.className = "cell " + getLevel(score);
  });
}

document.getElementById("riskForm").onsubmit = async e => {
  e.preventDefault();

  const data = {
    asset: asset.value,
    threat: threat.value,
    likelihood: +likelihood.value,
    impact: +impact.value
  };

  await fetch("/api/assess-risk", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(data)
  });

  loadHeatmap();
};

loadHeatmap();
