const mongoose = require("mongoose");

const UserSchema = new mongoose.Schema({
	name: {type:String,
		required:[true,"the name is required"],
		minlength:[3,"the length must be more than 3 char"]
	},
	type: {type:String,
		required:[true,"the type is required"],
		minlength:[3,"the length must be more than 3 char"]
	},
	desc: {type:String,
		required:[true,"the Description is required"],
		minlength:[3,"the length must be more than 3 char"]
	},
	like:{type:Number ,default:0},
	
	stat:{type:Number,default:0},

	states:{skill1:"",skill2:"",skill3:""}
});

const User = mongoose.model("trying", UserSchema);

module.exports = User;