Array.prototype.remove = function(member) {
	var index = this.indexOf(member);
	if (index >= 0) {
		this.splice(index, 1);
	} 
};

var arr = [1, 2, 3];

console.log(arr);

arr.remove(1);

console.log(arr);