// const a = [1, 8, 8, 9, 7, 9, 0, 56];
// let i = 0;
// for (i = 0; i < a.length; i++) {
//   for (j = i + 1; j < a.length; j++) {
//     if (a[i] === a[j]) console.log(a[i]);
//   }
// }
const obj = [
  {
    university: {
      uniName: "anna uni",
      colleges: [
        {
          collegeName: "sathyabama",
          collegeLoc: "chennai",
          dept: [
            { math: { femStudents: 10, maleStud: 20 } },
            { chem: { femStudents: 30, maleStud: 90 } },
            { sci: { femStudents: 40, maleStud: 20 } },
            { art: { femStudents: 0, maleStud: 20 } },
          ],
        },
        { collegeName: "Agni", collegeLoc: "OMR", dept: [] },
      ],
    },
  },
];

const colleges = obj.map(({ university }) => university.colleges).flat();
const depts = colleges.map(({ dept = [] }) => dept).flat();

const deptObjs = depts.map((e) => Object.keys(e));
console.log(deptObjs.flat());

const newDept = { defense: { femStudents: 0, maleStud: 20 } };
const updated = obj
  .map(({ university }) => university.colleges)
  .map((collegeData) => collegeData.map(({ dept = [] }) => dept.push(newDept)));

console.log(JSON.stringify(obj));

const chemMarks = depts.map(({ chem }) => chem).filter((e) => e);
console.log(chemMarks);
