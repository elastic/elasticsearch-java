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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.validate_detector.Request
public final class ValidateDetectorRequest extends RequestBase implements JsonpSerializable {
	private final Detector value;

	// ---------------------------------------------------------------------------------------------

	public ValidateDetectorRequest(Builder builder) {

		this.value = Objects.requireNonNull(builder.value, "value");

	}

	/**
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public Detector value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.value.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ValidateDetectorRequest}.
	 */
	public static class Builder implements ObjectBuilder<ValidateDetectorRequest> {
		private Detector value;

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Detector value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Function<Detector.Builder, ObjectBuilder<Detector>> fn) {
			return this.value(fn.apply(new Detector.Builder()).build());
		}

		/**
		 * Builds a {@link ValidateDetectorRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ValidateDetectorRequest build() {

			return new ValidateDetectorRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ValidateDetectorRequest}
	 */
	public static final JsonpDeserializer<ValidateDetectorRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ValidateDetectorRequest::setupValidateDetectorRequestDeserializer);

	protected static void setupValidateDetectorRequestDeserializer(
			DelegatingDeserializer<ValidateDetectorRequest.Builder> op) {

		op.add(Builder::value, Detector.DESERIALIZER, "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.validate_detector}".
	 */
	public static final Endpoint<ValidateDetectorRequest, ValidateDetectorResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_ml/anomaly_detectors/_validate/detector";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, ValidateDetectorResponse.DESERIALIZER);
}
