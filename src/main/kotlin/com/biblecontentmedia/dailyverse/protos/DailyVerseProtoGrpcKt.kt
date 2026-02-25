package com.biblecontentmedia.dailyverse.protos

import com.biblecontentmedia.dailyverse.protos.DailyVerseServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService.
 */
public object DailyVerseServiceGrpcKt {
  public const val SERVICE_NAME: String = DailyVerseServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getDailyVerseMethod: MethodDescriptor<GetDailyVerseRequest, DailyVerseResponse>
    @JvmStatic
    get() = DailyVerseServiceGrpc.getGetDailyVerseMethod()

  public val listVersesMethod: MethodDescriptor<ListVersesRequest, ListVersesResponse>
    @JvmStatic
    get() = DailyVerseServiceGrpc.getListVersesMethod()

  public val getVerseDetailMethod: MethodDescriptor<GetVerseRequest, VerseDetailResponse>
    @JvmStatic
    get() = DailyVerseServiceGrpc.getGetVerseDetailMethod()

  /**
   * A stub for issuing RPCs to a(n) com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService
   * service as suspending coroutines.
   */
  @StubFor(DailyVerseServiceGrpc::class)
  public class DailyVerseServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<DailyVerseServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): DailyVerseServiceCoroutineStub =
        DailyVerseServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getDailyVerse(request: GetDailyVerseRequest, headers: Metadata = Metadata()):
        DailyVerseResponse = unaryRpc(
      channel,
      DailyVerseServiceGrpc.getGetDailyVerseMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listVerses(request: ListVersesRequest, headers: Metadata = Metadata()):
        ListVersesResponse = unaryRpc(
      channel,
      DailyVerseServiceGrpc.getListVersesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getVerseDetail(request: GetVerseRequest, headers: Metadata = Metadata()):
        VerseDetailResponse = unaryRpc(
      channel,
      DailyVerseServiceGrpc.getGetVerseDetailMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService
   * service based on Kotlin coroutines.
   */
  public abstract class DailyVerseServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService.GetDailyVerse.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getDailyVerse(request: GetDailyVerseRequest): DailyVerseResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService.GetDailyVerse is unimplemented"))

    /**
     * Returns the response to an RPC for
     * com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService.ListVerses.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listVerses(request: ListVersesRequest): ListVersesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService.ListVerses is unimplemented"))

    /**
     * Returns the response to an RPC for
     * com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService.GetVerseDetail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getVerseDetail(request: GetVerseRequest): VerseDetailResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.biblecontentmedia.dailyverse.protos.v1.DailyVerseService.GetVerseDetail is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DailyVerseServiceGrpc.getGetDailyVerseMethod(),
      implementation = ::getDailyVerse
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DailyVerseServiceGrpc.getListVersesMethod(),
      implementation = ::listVerses
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = DailyVerseServiceGrpc.getGetVerseDetailMethod(),
      implementation = ::getVerseDetail
    )).build()
  }
}
