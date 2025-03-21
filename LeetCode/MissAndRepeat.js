const main = () => {
  // const a = [2, 2, 3, 4, 5];
  const a = [1, 1, 2, 3, 4];
  let k = a[0],
    miss = -1,
    repeat = -1;
  for (let i = 1; i < a.length - 1; i++) {
    ++k;
    if (a[i] === a[i - 1]) repeat = a[i];
    else if (a[i] != k && a[i + 1] != k) miss = a[i];
  }
  console.log(`repeat - ${repeat} \n miss - ${miss === -1 ? k + 1 : miss}`);
};
main();
// Repeat 1
// Miss 5
