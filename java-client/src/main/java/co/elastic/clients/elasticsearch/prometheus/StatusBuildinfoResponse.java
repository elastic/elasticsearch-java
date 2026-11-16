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

package co.elastic.clients.elasticsearch.prometheus;

import co.elastic.clients.elasticsearch.prometheus.status_buildinfo.BuildInfo;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: prometheus.status_buildinfo.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#prometheus.status_buildinfo.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class StatusBuildinfoResponse implements JsonpSerializable {
	private final String status;

	private final BuildInfo data;

	// ---------------------------------------------------------------------------------------------

	private StatusBuildinfoResponse(Builder builder) {

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.data = ApiTypeHelper.requireNonNull(builder.data, this, "data");

	}

	public static StatusBuildinfoResponse of(Function<Builder, ObjectBuilder<StatusBuildinfoResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The status of the request. It is always <code>success</code>.
	 * <p>
	 * API name: {@code status}
	 */
	public final String status() {
		return this.status;
	}

	/**
	 * Required - The Elasticsearch build information.
	 * <p>
	 * API name: {@code data}
	 */
	public final BuildInfo data() {
		return this.data;
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

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("data");
		this.data.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StatusBuildinfoResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<StatusBuildinfoResponse> {
		private String status;

		private BuildInfo data;

		/**
		 * Required - The status of the request. It is always <code>success</code>.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(String value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - The Elasticsearch build information.
		 * <p>
		 * API name: {@code data}
		 */
		public final Builder data(BuildInfo value) {
			this.data = value;
			return this;
		}

		/**
		 * Required - The Elasticsearch build information.
		 * <p>
		 * API name: {@code data}
		 */
		public final Builder data(Function<BuildInfo.Builder, ObjectBuilder<BuildInfo>> fn) {
			return this.data(fn.apply(new BuildInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StatusBuildinfoResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StatusBuildinfoResponse build() {
			_checkSingleUse();

			return new StatusBuildinfoResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StatusBuildinfoResponse}
	 */
	public static final JsonpDeserializer<StatusBuildinfoResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StatusBuildinfoResponse::setupStatusBuildinfoResponseDeserializer);

	protected static void setupStatusBuildinfoResponseDeserializer(
			ObjectDeserializer<StatusBuildinfoResponse.Builder> op) {

		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status");
		op.add(Builder::data, BuildInfo._DESERIALIZER, "data");

	}

}
