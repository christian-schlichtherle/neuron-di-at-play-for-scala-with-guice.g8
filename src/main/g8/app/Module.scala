import controllers.GreeterController
import global.namespace.neuron.di.guice.scala._

class Module extends NeuronModule {

  override def configure(): Unit = {
    bindClass[GreeterController].toNeuronClass[GreeterController]
    // alias:
    //bindNeuronClass[GreeterController]
  }
}
