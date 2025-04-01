// 0132564

const bfs = (graph, startNode) => {
  let queue = [startNode];
  let visitedSet = new Set();

  while (queue.length) {
    let node = queue.shift();
    console.log(node);

    if (visitedSet.has(node)) continue;
    visitedSet.add(node);
    graph[node].map((neighbor) => queue.push(neighbor));
  }
};

const graph = { A: ["B", "C"], B: ["D"], C: ["E"], D: [], E: [] };
bfs(graph, "A");
