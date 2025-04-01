const main = (node, visitedSet = new Set()) => {
  if (visitedSet.has(node)) return;
  console.log(node);
  visitedSet.add(node);
  graph[node].map((neighbor) => main(neighbor, visitedSet));
};
const graph = {
  A: ["B", "C"],
  B: ["D", "E"],
  C: ["F"],
  D: [],
  E: ["F"],
  F: [],
};
main("A");
