using esame.Models;
using Microsoft.AspNetCore.Mvc;


namespace esame.Controllers
{
    public class FroggerController : Controller
    {
        private static List<FroggerViewModel> frogger = new List<FroggerViewModel>();

        public IActionResult Index()
        {
            FroggerViewModel.Ordina(frogger);
            return View(frogger);
        }
        public IActionResult Inserct()
        {
            var frogVm = new FroggerViewModel();
            return View(frogVm);
        }

        public IActionResult InserctFrogger(FroggerViewModel froggerViewModel)
        {
            frogger.Add(froggerViewModel);
            return RedirectToAction(nameof(Index));
        }

    }
}
