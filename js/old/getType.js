(function() {

	Object.prototype.getType = function() {
		return ({}).toString.call(this).match(/\s([a-zA-Z]+)/)[1].toLowerCase();
	};

	var arr = [];
	var i = 5;

	console.log(arr.getType());
	console.log(i.getType());

	Array.prototype.isArray = function(obj) {
		return obj.getType() === "array";
	};

	console.log(Array.prototype.isArray(arr));
	console.log(Array.prototype.isArray(i));
})();