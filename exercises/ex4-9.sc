// exercise 4, Greater Expressions

1 < 2 // type Boolean
(3 + 2) > 7 // type Boolean

// check type by annotating type and seeing if the compiler 
// 1 < 2: String

// exercise 5, Abyssal Depths

val abyss = """
	Be with me always-take any form-drive me mad!
	only do not leave me in this abyss, where I cannot find you!
"""
val leave_me = abyss.substring(61, 83)
println(leave_me)

// exercise 6, Floating Point Failings

// Double is 64 bit

// exercise 7, Appending Strings

val append1 = "Hi ".++("There")
val append2 = "Hi " ++ "There"
println(append1)

// ex. 8, Stylish Operator

// This infix operator style:
val t1 = "What is the truth?" substring 12
// is equal to meethod syntax:
val t2 = "What is the truth?".substring(12)
println(t1 == t2)

// this:
// val t1 = "What is the truth?" substring 12 33
// won't compile because the style works on single-parameters methods.

// ex. 9, Beyond Expressions

// Current computation model consists of three components:
// expressions (program text) with types, which evaluates to values
// stored in the computer memory
// Is that model enough for larger computations or we need something more?

// Current model operates only on the computer's memory. 
// We need the way to create effects - changes in the world that
// go beyond the memory such as printing on the screen. Console
// does part of the job, but we need more. What about making sound, 
// sending messages to other computers or creating our own objects, methods.

