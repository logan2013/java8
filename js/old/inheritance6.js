(function() {
	
	function Parent(username) {
		this.username = username;
	}
	Parent.prototype.sayHello = function() {
		return this.username;
	};
	
	function Child(username, password) {
		Parent.call(this, username);
		
		this.password = password;
	}
	Child.prototype = new Parent();
	Child.prototype.sayWorld = function() {
		return this.password;
	};
	
	var child = new Child("zhangsan", "123");
	console.log(child.sayHello());
	console.log(child.sayWorld());
})();