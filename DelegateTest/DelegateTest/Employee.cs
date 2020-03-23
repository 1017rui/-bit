using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTest
{
    class Employee
    {
        public event PlayGameHandler play;//事件委托如何方便的实现程序的绑定。
        private int m_salary;

        public int Salary
        {
            get { return m_salary; }
            set { m_salary = value; }
        }
        public Employee()
        {
            Console.WriteLine("创建员工对象！");  
           m_salary=3000;
        }
        public void playGame()
        {
            Console.WriteLine("游戏真好玩！");
            EventArgs e = new EventArgs();
            onPlayGame(e);
        }
        public virtual void onPlayGame(EventArgs e)
        {
            if (play != null)
                play(this, e);
            else
                Console.WriteLine("玩游戏处理时间未定义");
        }
    }
}
