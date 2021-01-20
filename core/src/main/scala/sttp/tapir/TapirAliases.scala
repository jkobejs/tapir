package sttp.tapir

/** Mixin containing aliases for top-level types and modules in the tapir package. */
trait TapirAliases {

  /** Codec.scala */
  type Codec[L, H, CF <: CodecFormat] = sttp.tapir.Codec[L, H, CF]
  val Codec = sttp.tapir.Codec

  /** DecodeResult.scala */
  type DecodeResult[+T] = sttp.tapir.DecodeResult[T]
  val DecodeResult = sttp.tapir.DecodeResult

  /** Defaults.scala */
  val Defaults = sttp.tapir.Defaults

  /** Endpoint.scala */
  type Endpoint[I, E, O, -R] = sttp.tapir.Endpoint[I, E, O, R]
  val Endpoint = sttp.tapir.Endpoint

  type EndpointInfo = sttp.tapir.EndpointInfo
  val EndpointInfo = sttp.tapir.EndpointInfo

  /** EndpointIO.scala */
  type EndpointInput[I, -R] = sttp.tapir.EndpointInput[I, R]
  val EndpointInput = sttp.tapir.EndpointInput

  type EndpointOutput[O, -R] = sttp.tapir.EndpointOutput[O, R]
  val EndpointOutput = sttp.tapir.EndpointOutput

  type EndpointIO[I, -R] = sttp.tapir.EndpointIO[I, R]
  val EndpointIO = sttp.tapir.EndpointIO

  /** package.scala */
  type RawPart = sttp.tapir.RawPart
  type AnyPart = sttp.tapir.AnyPart
  type AnyListCodec = sttp.tapir.AnyListCodec
  type MultipartCodec[T] = sttp.tapir.MultipartCodec[T]

  /** RenderPathTemplate.scala */
  val RenderPathTemplate = sttp.tapir.RenderPathTemplate

  /** SchemaType.scala */
  type SchemaType = sttp.tapir.SchemaType
  val SchemaType = sttp.tapir.SchemaType

  /** Schema.scala */
  type Schema[T] = sttp.tapir.Schema[T]
  val Schema: sttp.tapir.Schema.type = sttp.tapir.Schema

  /** Tapir.scala */
  type Tapir = sttp.tapir.Tapir
  type TapirDerivedInputs = sttp.tapir.TapirDerivedInputs

  /** TapirAuth.scala */
  val TapirAuth = sttp.tapir.TapirAuth
}
