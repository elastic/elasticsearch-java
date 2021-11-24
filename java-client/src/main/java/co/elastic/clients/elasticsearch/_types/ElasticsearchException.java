/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch._types;

/**
 * Exception thrown by API client methods when Elasticsearch could not accept or
 * process a request.
 * <p>
 * The {@link #error()} contains the error's type and reason along with
 * additional details that depend on the error type and the API endpoint that
 * was called.
 */
public class ElasticsearchException extends RuntimeException {

	private final ErrorResponse response;
	private final String endpointId;

	public ElasticsearchException(String endpointId, ErrorResponse response) {
		super("[" + endpointId + "] failed: [" + response.error().type() + "] " + response.error().reason());
		this.response = response;
		this.endpointId = endpointId;
	}

	/**
	 * Identifier of the API endpoint that failed to be called.
	 */
	public String endpointId() {
		return this.endpointId;
	}

	/**
	 * The error response sent by Elasticsearch
	 */
	public ErrorResponse response() {
		return this.response;
	}

	/**
	 * The cause of the error. Shortcut for {@code response().error()}.
	 */
	public ErrorCause error() {
		return this.response.error();
	}

	/**
	 * Status code returned by Elasticsearch. Shortcut for
	 * {@code response().status()}.
	 */
	public int status() {
		return this.response.status();
	}
}
