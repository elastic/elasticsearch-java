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

// typedef: ml.open_job.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.open_job.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class OpenJobResponse implements JsonpSerializable {
	private final boolean opened;

	// ---------------------------------------------------------------------------------------------

	private OpenJobResponse(Builder builder) {

		this.opened = ApiTypeHelper.requireNonNull(builder.opened, this, "opened");

	}

	public static OpenJobResponse of(Function<Builder, ObjectBuilder<OpenJobResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code opened}
	 */
	public final boolean opened() {
		return this.opened;
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

		generator.writeKey("opened");
		generator.write(this.opened);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenJobResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<OpenJobResponse> {
		private Boolean opened;

		/**
		 * Required - API name: {@code opened}
		 */
		public final Builder opened(boolean value) {
			this.opened = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OpenJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenJobResponse build() {
			_checkSingleUse();

			return new OpenJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OpenJobResponse}
	 */
	public static final JsonpDeserializer<OpenJobResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			OpenJobResponse::setupOpenJobResponseDeserializer);

	protected static void setupOpenJobResponseDeserializer(ObjectDeserializer<OpenJobResponse.Builder> op) {

		op.add(Builder::opened, JsonpDeserializer.booleanDeserializer(), "opened");

	}

}
