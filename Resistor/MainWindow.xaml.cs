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

namespace Esame_1
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


        private void InviaButton_Click(object sender, RoutedEventArgs e)
        {

        }

        private void Colori_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (this.NoteText == null)
                return;

            var combo = (ComboBox)sender;
            var value = (ComboBoxItem)combo.SelectedValue;

            switch ((string)value.Content)
            {
                case "Nero":
                    this.NoteText.Text = "0";
                    this.ColorBox.Background = Brushes.Black;
                    break;
                case "Marrone":
                    this.NoteText.Text = "1";
                    this.ColorBox.Background = Brushes.SaddleBrown;
                    break;
                case "Rosso":
                    this.NoteText.Text = "2";
                    this.ColorBox.Background = Brushes.Red;
                    break;
                case "Arancio":
                    this.NoteText.Text = "3";
                    this.ColorBox.Background = Brushes.DarkOrange;
                    break;
                case "Giallo":
                    this.NoteText.Text = "4";
                    this.ColorBox.Background = Brushes.Yellow;
                    break;
                case "Verde":
                    this.NoteText.Text = "5";
                    this.ColorBox.Background = Brushes.LightGreen;
                    break;
                case "Blu":
                    this.NoteText.Text = "6";
                    this.ColorBox.Background = Brushes.Blue;
                    break;
                case "Viola":
                    this.NoteText.Text = "7";
                    this.ColorBox.Background = Brushes.DarkViolet;
                    break;
                case "Grigio":
                    this.NoteText.Text = "8";
                    this.ColorBox.Background = Brushes.Gray;
                    break;
                case "Bianco":
                    this.NoteText.Text = "9";
                    this.ColorBox.Background = Brushes.White;
                    break;

            }

        }

        
    }
}
