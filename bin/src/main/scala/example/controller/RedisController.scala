package example.controller

import java.util.concurrent.atomic.AtomicInteger

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.stereotype.Controller

@Controller
class RedisController
{

  val counter: AtomicInteger = new AtomicInteger()

	@GetMapping(Array("/redis"))
	def getCreate(model: Model): String =
	{
    val click: Int = getCount()
		model.addAttribute("click", click)
		return "redis"
	}

  @PostMapping(Array("/redis"))
  def postCreate(model: Model): String =
	{
    counter.incrementAndGet()
    val click: Int = getCount()
		model.addAttribute("click", click)
		return "redis"
	}

  def getCount(): Int =
  {
    return counter.get()
  }

}
