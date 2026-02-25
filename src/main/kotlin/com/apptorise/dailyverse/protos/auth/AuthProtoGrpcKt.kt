package com.apptorise.dailyverse.protos.auth

import com.apptorise.dailyverse.protos.auth.AuthServiceGrpc.getServiceDescriptor
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
 * com.apptorise.dailyverse.protos.auth.v1.AuthService.
 */
public object AuthServiceGrpcKt {
  public const val SERVICE_NAME: String = AuthServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val signInWithEmailMethod: MethodDescriptor<EmailSignInRequest, AuthResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getSignInWithEmailMethod()

  public val signInWithGoogleMethod: MethodDescriptor<GoogleSignInRequest, AuthResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getSignInWithGoogleMethod()

  public val signInWithAppleMethod: MethodDescriptor<AppleSignInRequest, AuthResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getSignInWithAppleMethod()

  public val refreshTokenMethod: MethodDescriptor<RefreshRequest, AuthResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getRefreshTokenMethod()

  /**
   * A stub for issuing RPCs to a(n) com.apptorise.dailyverse.protos.auth.v1.AuthService service as
   * suspending coroutines.
   */
  @StubFor(AuthServiceGrpc::class)
  public class AuthServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AuthServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AuthServiceCoroutineStub =
        AuthServiceCoroutineStub(channel, callOptions)

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
    public suspend fun signInWithEmail(request: EmailSignInRequest, headers: Metadata = Metadata()):
        AuthResponse = unaryRpc(
      channel,
      AuthServiceGrpc.getSignInWithEmailMethod(),
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
    public suspend fun signInWithGoogle(request: GoogleSignInRequest, headers: Metadata =
        Metadata()): AuthResponse = unaryRpc(
      channel,
      AuthServiceGrpc.getSignInWithGoogleMethod(),
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
    public suspend fun signInWithApple(request: AppleSignInRequest, headers: Metadata = Metadata()):
        AuthResponse = unaryRpc(
      channel,
      AuthServiceGrpc.getSignInWithAppleMethod(),
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
    public suspend fun refreshToken(request: RefreshRequest, headers: Metadata = Metadata()):
        AuthResponse = unaryRpc(
      channel,
      AuthServiceGrpc.getRefreshTokenMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the com.apptorise.dailyverse.protos.auth.v1.AuthService service
   * based on Kotlin coroutines.
   */
  public abstract class AuthServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * com.apptorise.dailyverse.protos.auth.v1.AuthService.SignInWithEmail.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun signInWithEmail(request: EmailSignInRequest): AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.apptorise.dailyverse.protos.auth.v1.AuthService.SignInWithEmail is unimplemented"))

    /**
     * Returns the response to an RPC for
     * com.apptorise.dailyverse.protos.auth.v1.AuthService.SignInWithGoogle.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun signInWithGoogle(request: GoogleSignInRequest): AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.apptorise.dailyverse.protos.auth.v1.AuthService.SignInWithGoogle is unimplemented"))

    /**
     * Returns the response to an RPC for
     * com.apptorise.dailyverse.protos.auth.v1.AuthService.SignInWithApple.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun signInWithApple(request: AppleSignInRequest): AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.apptorise.dailyverse.protos.auth.v1.AuthService.SignInWithApple is unimplemented"))

    /**
     * Returns the response to an RPC for
     * com.apptorise.dailyverse.protos.auth.v1.AuthService.RefreshToken.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun refreshToken(request: RefreshRequest): AuthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method com.apptorise.dailyverse.protos.auth.v1.AuthService.RefreshToken is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getSignInWithEmailMethod(),
      implementation = ::signInWithEmail
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getSignInWithGoogleMethod(),
      implementation = ::signInWithGoogle
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getSignInWithAppleMethod(),
      implementation = ::signInWithApple
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getRefreshTokenMethod(),
      implementation = ::refreshToken
    )).build()
  }
}
