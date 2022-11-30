using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace ProvaCs3
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        List<string> elenco = new ();
        private void Submit_Click(object sender, RoutedEventArgs e)
        {


            if (string.IsNullOrEmpty(Input.Text))
            {
                Input.Text = "Devi Inserire qualcosa";
            }
            else
            {
                List<string> list = new();
                list.Add(Input.Text);
                elenco.Add(Input.Text);

                foreach (string s in list)
                {
                    List.AppendText(s + Environment.NewLine);
                    Input.Text = "";
                }

            }

        }

        private void Keep_Click(object sender, RoutedEventArgs e)
        {
            List<string> keepList = elenco;

            if (string.IsNullOrEmpty(List.Text))
            {
                Output.Text = "Non ci sono elementi da mostrare";
            }
            else
            {
                Output.Text = String.Empty;
                foreach(string s in keepList)
                {
                    if(Int32.Parse(s) % 2 == 0)
                    {
                        Output.AppendText(s + Environment.NewLine);
                    }
                }
            }

        }

        private void Discard_Click(object sender, RoutedEventArgs e)
        {
            List<string> discardList = elenco;

            if (string.IsNullOrEmpty(List.Text))
            {
                Output.Text = "Non ci sono elementi da mostrare";
            }
            else
            {
                Output.Text = String.Empty;
                foreach (string s in discardList)
                {
                    if (Int32.Parse(s) % 2 == 1)
                    {
                        Output.AppendText(s + Environment.NewLine);
                    }
                }
            }
        }
    }
    
}
