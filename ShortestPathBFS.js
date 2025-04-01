const main = (graph, start, destination) => {
  const queue = [[start]];
  let visitedSet = new Set();

  while (queue.length) {
    let path = queue.shift();
    let node = path[path.length - 1];

    if (node === destination) return path;
    if (visitedSet.has(node)) continue;
    visitedSet.add(node);
    graph[node].map((neighbor) => queue.push([...path, neighbor]));
  }
};

const cityMap = {
  A: ["B", "C"],
  B: ["A", "D", "E"],
  C: ["A", "F"],
  D: ["B"],
  E: ["B", "F"],
  F: ["C", "E"],
};
const shorestPath = main(cityMap, "A", "F");
console.log(shorestPath);
