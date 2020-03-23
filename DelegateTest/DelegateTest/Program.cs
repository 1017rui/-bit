using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateTest
{
    //定义委托
    public delegate void PlayGameHandler(object sender,EventArgs e);
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("场景开始！");
            //Manager_ori zhang = new Manager_ori();
            //Employee_ori wang =new Employee_ori(zhang);
            //Console.WriteLine("员工初始薪水为：" + wang.Salary);
            //wang.playGame();
            //System.Threading.Thread.Sleep(2000);
            //Console.WriteLine("员工现在薪水为：" + wang.Salary);



            Employee wang = new Employee();
            Manager zhang = new Manager();
            Console .WriteLine("员工初始薪水为："+wang.Salary);
            wang.play += new PlayGameHandler(zhang.deductSalary);
            System.Threading.Thread.Sleep(2000);
            wang.playGame();
            Console.WriteLine("员工现在薪水为：" + wang.Salary);

            Console.WriteLine("场景结束！");
            Console.ReadLine();

        }
    }
}
