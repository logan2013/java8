var o = {};
o.x = 42;

console.log(o.y);

o.y = "abc";
console.log(o.y);

delete o.x;

console.log(o.x);