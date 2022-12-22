const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema({
	name: {type:String,
		required:[true,"the name is required"],
		minlength:[3,"the length must be more than 3 char"]
	},
	
	position:{type: String},
	states:{game1:Number,game2:Number,game3:Number}
});

const User = mongoose.model("team", UserSchema);

module.exports = User;