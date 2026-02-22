function main(n, numbers) {
  // const [nStr,a] = input.split("\n");
  // const n = Number(nStr);
  // const numbers = a.split(" ").map(Number);

  const arraySum = numbers.reduce((acc, e) => acc + e, 0);
  const op = Math.ceil(arraySum / n);
  console.log(op);
}

main(5, [1, 2, 3, 4, 5]);

const search = "hari";
const page = 0;
const match = {
  $match: {
    $or: [{ name: { regex: `^${search}`, $options: "i" } }],
  },
};

const count = await Promise.all(db.find({ name: "hari" }).countDocuments());

const pagination = [
  { $sort: { createdAt: -1 } },
  { $skip: page * 15 },
  { $limit: 15 },
];

const stausCount = [
  { $match: { status: "paid" } },
  { $group: { total: { $sum: "$count" } } },
];
