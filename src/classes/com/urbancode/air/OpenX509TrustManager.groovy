/**
 * � Copyright IBM Corporation 2014.  
 * This is licensed under the following license.
 * The Eclipse Public 1.0 License (http://www.eclipse.org/legal/epl-v10.html)
 * U.S. Government Users Restricted Rights:  Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp. 
 */

package com.urbancode.air;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * This class implements a {@link X509TrustManager} which will accept all
 * certificates and allow SSL connections to remote machines with untrusted or
 * self-signed certificates.
 */
public class OpenX509TrustManager implements X509TrustManager {

    //**************************************************************************
    // CLASS
    //**************************************************************************
    final private static X509Certificate[] acceptedIssuers = new X509Certificate[0];

    //**************************************************************************
    // INSTANCE
    //**************************************************************************

    //--------------------------------------------------------------------------
    /**
     * Given the partial or complete certificate chain provided by the peer,
     * build a certificate path to a trusted root and return if it can be
     * validated and is trusted for client SSL authentication based on the
     * authentication type. The authentication type is determined by the actual
     * certificate used. For instance, if RSAPublicKey is used, the authType
     * should be "RSA". Checking is case-sensitive.
     *
     * @param chain
     *        The peer certificate chain.
     * @param authType
     *        The authentication type based on the client certificate.
     * @throws CertificateException
     *         If the certificate chain is not trusted by this TrustManager.
     */
    public void checkClientTrusted(X509Certificate[] chain, String authType)
    throws CertificateException {
    }

    //--------------------------------------------------------------------------
    /**
     * Given the partial or complete certificate chain provided by the peer,
     * build a certificate path to a trusted root and return if it can be
     * validated and is trusted for server SSL authentication based on the
     * authentication type. The authentication type is the key exchange
     * algorithm portion of the cipher suites represented as a String, such as
     * "RSA", "DHE_DSS". Note: for some exportable cipher suites, the key
     * exchange algorithm is determined at run time during the handshake. For
     * instance, for TLS_RSA_EXPORT_WITH_RC4_40_MD5, the authType should be
     * RSA_EXPORT when an ephemeral RSA key is used for the key exchange, and
     * RSA when the key from the server certificate is used. Checking is
     * case-sensitive.
     *
     * @param chain
     *        The peer certificate chain.
     * @param authType
     *        The key exchange algorithm used.
     */
    public void checkServerTrusted(X509Certificate[] chain, String authType) {
    }

    //--------------------------------------------------------------------------
    /**
     * Return an array of certificate authority certificates which are trusted
     * for authenticating peers.
     *
     * @return a non-null (possibly empty) array of acceptable CA issuer
     *         certificates.
     */
    public X509Certificate[] getAcceptedIssuers() {
        return OpenX509TrustManager.acceptedIssuers;
    }
}