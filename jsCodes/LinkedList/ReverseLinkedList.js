const Node = (data, next) => {
  return { data: data, next: next }
}

const reverseNodes = (head, prev, curr) => {
  if (curr == null) {
    head.next = null
    return prev
  }
  let temp = curr.next
  curr.next = prev
  return reverseNodes(head, curr, temp)
}

const reverseKthNodes = (head, prev, curr, position) => {
  let index = 1
  while (curr != null && position > index) {
    let temp = curr.next
    curr.next = prev
    prev = curr
    curr = temp
    index++
  }

  if (curr != null) {
    head.next = reverseKthNodes(curr, curr, curr.next, position)
  }
  return prev
}

let totalNode = 9
let lastNode = Node(totalNode, null)

for (let i = totalNode - 1; i >= 1; i--) {
  let newNode = Node(i, lastNode)
  lastNode = newNode
}
let llistHead = lastNode

reverseNodes(llistHead, llistHead, llistHead.next)
reverseKthNodes(llistHead, llistHead, llistHead.next, 3, 1)
