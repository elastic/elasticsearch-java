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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.close_job.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.close_job.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class CloseJobResponse implements JsonpSerializable {
	private final boolean closed;

	// ---------------------------------------------------------------------------------------------

	private CloseJobResponse(Builder builder) {

		this.closed = ApiTypeHelper.requireNonNull(builder.closed, this, "closed");

	}

	public static CloseJobResponse of(Function<Builder, ObjectBuilder<CloseJobResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code closed}
	 */
	public final boolean closed() {
		return this.closed;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("closed");
		generator.write(this.closed);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloseJobResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CloseJobResponse> {
		private Boolean closed;

		/**
		 * Required - API name: {@code closed}
		 */
		public final Builder closed(boolean value) {
			this.closed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CloseJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloseJobResponse build() {
			_checkSingleUse();

			return new CloseJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CloseJobResponse}
	 */
	public static final JsonpDeserializer<CloseJobResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CloseJobResponse::setupCloseJobResponseDeserializer);

	protected static void setupCloseJobResponseDeserializer(ObjectDeserializer<CloseJobResponse.Builder> op) {

		op.add(Builder::closed, JsonpDeserializer.booleanDeserializer(), "closed");

	}

}
