package com.wolfsea.windowsoftinputmodetest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wolfsea.windowsoftinputmodetest.util.ActivityUtil.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        not_scroll_layout_btn.setOnClickListener {

             startActivity<NotScrollLayoutActivity>()
        }

        scroll_layout_btn.setOnClickListener {

            startActivity<ScrollLayoutActivity>()
        }

        /*
        * 控制软键盘是显示还是隐藏:

          stateUnSpecified:  不指定软键盘的状态(显示还是隐藏),将由系统选择合适的状态;或者依赖主题中的设置.该模式为软键盘的默认设置.

          stateUnchanged:   保留状态,当Activity转至前台时,保留软键盘最后所处的任何状态,无论是可见还是隐藏.

          stateHidden:   隐藏软键盘,当用户确实是向前导航到Activity,而不是因离开一Activity时,隐藏软键盘.

          stateAlwaysHidden:  始终隐藏软键盘,当Activity的窗口有焦点时,始终隐藏软键盘.

          stateVisible：  显示软键盘,在正常的适宜的情况下(当用户向前导航到Activity的主窗口时)显示软键盘.

          stateAlwaysVisible:  显示软键盘,当用户确实是导航到Activity,而不是因离开另一Activity时返回.



         弹出软键盘时,是否需要对Activity进行调整:

         adjustUnspecified:  当软键盘弹出时,系统自动指定窗口的调整模式.根据不同的情况会选择adjustResize或者adjustPan的一种.

          滚动布局下:  布局的窗口并不会上移,而是通过重绘滚动控件(如ScrollView),让其滚动到最低端,并给键盘留出控件.当前模式为默认模式.

          非滚动布局下:  布局窗口会上移,直到显示获取焦点的控件.当前模式为默认模式.

        adjustPan:  当软键盘弹出时,会将主窗口平移,来适应软键盘的显示.

         滚动布局下:  布局窗口会上移,直到显示获取焦点的控件.

         非滚动布局下:  布局窗口会上移,直到显示获取焦点的控件.

       adjustResize:  当软键盘弹出时,会让布局重新绘制.这种一般使用与带有滑动性质的控制,让其向下滚动,然后适应软键盘的显示.

         滚动布局下:   布局的窗口并不会上移,而是通过重绘滚动控件(如ScrollView),让其滚动到最低端,并给键盘留出控件.

         非滚动布局下: 布局的窗口不会上移,软键盘输入法会覆盖当前获取焦点的控件.

       adjustNothing:  当软键盘弹出时,主窗口不会做出任何反应.

         滚动布局下:  布局的窗口不会上移,软键盘输入法会覆盖当前获取焦点的控件.

         非滚动布局下:  布局的窗口不会上移,软键盘输入法会覆盖当前获取焦点的控件.
        *
        *
        * */
    }
}