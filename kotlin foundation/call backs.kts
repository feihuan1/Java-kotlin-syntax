import java.sql.DriverManager.println

class Button {

    // a common way to handle callback code
    // is to set a property/var on another class
    private var clickListener: OnClickListener? = null
    fun performClick() {
        println("in the button's perform click function")

        // this is where the call back happens, when button click, we attempt to run the onClick methods on the OnCLickListener interface
        clickListener?.onClick()
    }

    // ths is where we provide the other code with our callback code, the call back exist within an interface
    // this is where we give the interface to our button class
    fun setOnCLickListener(listener: OnClickListener) {
        clickListener = listener
    }

}

val myButton = Button()
myButton.performClick()

interface  OnClickListener {
    fun onClick()
}

myButton.setOnCLickListener(object: OnClickListener {
    override fun onClick() {
        println("Now we are in the callback code!!")
    }
})

myButton.performClick() //"in the button's perform click function"