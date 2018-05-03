
package com.zhuinden.espressohelpersample

import android.support.constraint.ConstraintLayout
import android.support.test.espresso.intent.rule.IntentsTestRule
import android.support.test.runner.AndroidJUnit4
import com.zhuinden.espressohelper.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented Test2, which will execute on an Android device.
 *
 * See [Testing documentation](http://d.android.com/tools/Testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @JvmField
    @field:Rule
    var rule = IntentsTestRule(MainActivity::class.java)

    @Test
    fun clickButton() {
        R.id.container.checkIsAssignableFrom<ConstraintLayout>()
        R.id.helloWorld.checkHasText(R.string.hello_world)
        R.id.username.performTypeText("This is a test!")
        R.id.password.performTypeText("hunter2")
        R.id.button.performClick()
        checkNextActivity<SecondActivity>()
        R.id.secondText.checkHasText("Well done!")
    }
}