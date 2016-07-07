(function() {

	Function.prototype.curry = function() {

		var _method = this;

		var args = Array.prototype.slice.call(arguments);

		return function() {
			return _method.apply(this, args.concat(Array.prototype.slice
					.call(arguments)));
		};

	};

	var add = function(number1, number2) {
		return number1 + number2;
	};

	var add1000 = add.curry(1000);

	console.log(add1000(20));
})();

(function() {

	function sayName(name) {
		return function() {
			console.log(name);
		}
	}

	var f = sayName("hello");
	f();

})();

(function() {

	function delay(f) {
		setTimeout(f, 2000);
	}

	function sayHello() {
		console.log("hello world");
	}

	delay(sayHello);
})();