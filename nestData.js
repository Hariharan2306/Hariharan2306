const a = [
  { seqId: "1" },
  { seqId: "1.1" },
  { seqId: "1.1.1" },
  { seqId: "2" },
  { seqId: "2.1.1.1.1.1.1.1.1" },
  { seqId: "2.1" },
  { seqId: "3" },
];

const findParent = (a, el) => a.findIndex(({ seqId }) => seqId === el);

let [longestSeqId, toFindParent] = ["", ""];
while (longestSeqId.length !== 1) {
  const longestElement = a.reduce(
    (a, b) => (a.seqId.length > b.seqId.length ? a : b),
    {
      seqId: "",
    }
  );
  //to find parent
  [longestSeqId, toFindParent] = [longestElement.seqId, longestElement.seqId];
  //find parent
  let parentIdx = -1;

  while (parentIdx === -1 && toFindParent.length > 1) {
    toFindParent = toFindParent.slice(0, toFindParent.lastIndexOf("."));
    parentIdx = findParent(a, toFindParent);
  }
  if (parentIdx === -1) break;
  //reAssembling data
  a[parentIdx] = { ...a[parentIdx], child: longestElement };
  a[a.indexOf(longestElement)] = {
    ...a[a.indexOf(longestElement)],
    seqId: "0",
  };
}
console.log(a.filter(({ seqId }) => seqId !== "0"));

// //find parent
// let parentId = -1;
// let toFindParent = "2.1.1.1.1.1.1.1.1";

// while (parentId === -1 && toFindParent.length > 1) {
//   toFindParent = toFindParent.slice(0, toFindParent.lastIndexOf("."));
//   parentId = findParent(a, toFindParent);
// }
// console.log(parentId);

// op--
// const b = [
//     { seqId: '1', child: { seqId: '1.1' ,child :{ seqId: '1.1.1' }} },
//     { seqId: '2',child: { seqId: '2.1' } },
//     { seqId: '3' }
//   ];

// prioritise based on max length

//to do
// dynamic all elements
// assemble to parent
// reinitialize found elements
