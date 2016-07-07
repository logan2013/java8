(function() {
	function Parent(username) {}
	
	Parent.prototype.username = "zhangsan";
	Parent.prototype.sayHello = function() {
		return this.username;
	};


	function Child() {}
	Child.prototype = new Parent();
		
	Child.prototype.password = "123";
	Child.prototype.sayWorld = function() {
		return this.password;
	};
	
	var child = new Child();
	console.log(child.sayHello());
	console.log(child.sayWorld());
})();
