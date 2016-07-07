(function() {
	
	function Parent(username) {
		this.username = username;

		this.sayHello = function() {
			return this.username;
		};
	}
	Parent.prototype.walk = function() {
		return "walking...........";
	};
	
	function Child(password) {
		this.password = password;
		
		this.sayWorld = function() {
			return this.password;
		};
	}
	
	function extend(parent, child) {
		for (var i in parent) {
			child[i] = parent[i];
		}
	}
	
	var parent = new Parent("zhangsan");
	var child = new Child("123");
	extend(parent, child);
	
	console.log(child.sayHello());
	console.log(child.sayWorld());
	console.log(child.walk());
	
	console.log(child.hasOwnProperty("walk"));
})();