const fun1 = (a) => {
  const house = { color: "white", year: 2006 };
  const house1 = house.year;

  const b = 20;
  const c = house1 + a + b;

  return house1 + a + b;
};

// console.log(house1 + a + b);
// fun1(10);
// console.log(fun1(10));

const d = fun1(10);
console.log(d);
