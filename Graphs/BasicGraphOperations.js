class Graph {
  constructor () {
    this.AdjList = new Map()
  }

  addVertex (v) {
    this.AdjList.set(v, [])
  }

  setEdge (v, w) {
    this.AdjList.get(v).push(w)
  }
}

const DFSgraph = (graph, vertex, visited) => {
  visited[vertex] = true
  for (let edges of graph.AdjList.get(vertex)) {
    if (!visited[edges]) { DFSgraph(graph, edges, visited) }
  }
  return visited
}

const printGraph = (graph) => {
  for (let vertices of graph.AdjList.keys()) {
    console.log(vertices + ' --> ' + graph.AdjList.get(vertices))
  }
}

const CheckInwOut = (graph) => {
  let inwCount = {}
  let outCount = {}
  for (let vertices of graph.AdjList.keys()) {
    outCount[vertices] = graph.AdjList.get(vertices).length
    for (let inw of graph.AdjList.get(vertices)) {
      inwCount[inw] = (inwCount[inw] == null) ? 1 : ++inwCount[inw]
    }
  }
  for (let inward of Object.keys(inwCount)) {
    if (outCount[inward] !== inwCount[inward]) {
      return false
    }
  }
  return true
}

let inp = ['abc', 'efg', 'cde', 'ghi', 'ija']

let grap = new Graph()
for (let val of inp) {
  grap.addVertex(val.charAt(0))
}
for (let val of inp) {
  let strLen = val.length
  grap.setEdge(val.charAt(0), val.charAt(strLen - 1))
}
printGraph(grap)
let visited = {}
for (let vertices of grap.AdjList.keys()) {
  visited[vertices] = false
}
DFSgraph(grap, 'a', visited)
CheckInwOut(grap)
