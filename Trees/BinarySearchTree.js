let data = [120, 100, 80, 20, 0]

const binSearch = (tree, st, end) => {
  let arrLen = end - st
  if (arrLen > 1) {
    let binLen = Math.floor(arrLen / 2)
    if (tree[st + binLen - 1] < tree[st + binLen]) {
      return binSearch(tree, st + binLen, end)
    } else {
      return binSearch(tree, st, st + binLen)
    }
  }
  return tree[st]
}
binSearch(data, 0, data.length)
