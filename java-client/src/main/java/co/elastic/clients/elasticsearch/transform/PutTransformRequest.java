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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: transform.put_transform.Request
public class PutTransformRequest extends PreviewTransformRequest {
	private final String transformId;

	@Nullable
	private final Boolean deferValidation;

	// ---------------------------------------------------------------------------------------------

	public PutTransformRequest(AbstractBuilder<?> builder) {
		super(builder);

		this.transformId = Objects.requireNonNull(builder.transformId, "transform_id");
		this.deferValidation = builder.deferValidation;

	}

	/**
	 * Identifier for the transform. This identifier can contain lowercase
	 * alphanumeric characters (a-z and 0-9), hyphens, and underscores. It must
	 * start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code transform_id}
	 */
	public String transformId() {
		return this.transformId;
	}

	/**
	 * When true, deferrable validations are not run. This behavior may be desired
	 * if the source index does not exist until after the transform is created.
	 * <p>
	 * API name: {@code defer_validation}
	 */
	@Nullable
	public Boolean deferValidation() {
		return this.deferValidation;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTransformRequest}.
	 */
	public static class Builder extends PutTransformRequest.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutTransformRequest> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTransformRequest build() {

			return new PutTransformRequest(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				PreviewTransformRequest.AbstractBuilder<BuilderT> {
		private String transformId;

		@Nullable
		private Boolean deferValidation;

		/**
		 * Identifier for the transform. This identifier can contain lowercase
		 * alphanumeric characters (a-z and 0-9), hyphens, and underscores. It must
		 * start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code transform_id}
		 */
		public BuilderT transformId(String value) {
			this.transformId = value;
			return self();
		}

		/**
		 * When true, deferrable validations are not run. This behavior may be desired
		 * if the source index does not exist until after the transform is created.
		 * <p>
		 * API name: {@code defer_validation}
		 */
		public BuilderT deferValidation(@Nullable Boolean value) {
			this.deferValidation = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutTransformRequest}
	 */
	public static final JsonpDeserializer<PutTransformRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutTransformRequest::setupPutTransformRequestDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupPutTransformRequestDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		PreviewTransformRequest.setupPreviewTransformRequestDeserializer(op);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.put_transform}".
	 */
	public static final Endpoint<PutTransformRequest, PutTransformResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				if (request.transformId() != null)
					propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					buf.append(request.transformId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.deferValidation != null) {
					params.put("defer_validation", String.valueOf(request.deferValidation));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutTransformResponse.DESERIALIZER);
}
