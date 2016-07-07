(function() {
	
	function foo() {
		function bar() {
			return 5;
		}
		return bar();
		function bar() {
			return 8;
		}
	}
	console.log(foo());
})();

(function() {
	
	function foo() {
		var bar = function() {
			return 5;
		};
		
		return bar();
		
		var bar = function() {
			return 8;
		};
	}
	console.log(foo());
	
})();

(function() {
	
	function foo() {
		return bar();
		var bar = function() {
			return 5;
		};
		
		
		var bar = function() {
			return 8;
		};
	}
	console.log(foo());
})();