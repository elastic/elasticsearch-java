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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_filter.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.put_filter.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutFilterResponse implements JsonpSerializable {
	private final String description;

	private final String filterId;

	private final List<String> items;

	// ---------------------------------------------------------------------------------------------

	private PutFilterResponse(Builder builder) {

		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.filterId = ApiTypeHelper.requireNonNull(builder.filterId, this, "filterId");
		this.items = ApiTypeHelper.unmodifiableRequired(builder.items, this, "items");

	}

	public static PutFilterResponse of(Function<Builder, ObjectBuilder<PutFilterResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code filter_id}
	 */
	public final String filterId() {
		return this.filterId;
	}

	/**
	 * Required - API name: {@code items}
	 */
	public final List<String> items() {
		return this.items;
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

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("filter_id");
		generator.write(this.filterId);

		if (ApiTypeHelper.isDefined(this.items)) {
			generator.writeKey("items");
			generator.writeStartArray();
			for (String item0 : this.items) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutFilterResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<PutFilterResponse> {
		private String description;

		private String filterId;

		private List<String> items;

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code filter_id}
		 */
		public final Builder filterId(String value) {
			this.filterId = value;
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>items</code>.
		 */
		public final Builder items(List<String> list) {
			this.items = _listAddAll(this.items, list);
			return this;
		}

		/**
		 * Required - API name: {@code items}
		 * <p>
		 * Adds one or more values to <code>items</code>.
		 */
		public final Builder items(String value, String... values) {
			this.items = _listAdd(this.items, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutFilterResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutFilterResponse build() {
			_checkSingleUse();

			return new PutFilterResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutFilterResponse}
	 */
	public static final JsonpDeserializer<PutFilterResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutFilterResponse::setupPutFilterResponseDeserializer);

	protected static void setupPutFilterResponseDeserializer(ObjectDeserializer<PutFilterResponse.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::filterId, JsonpDeserializer.stringDeserializer(), "filter_id");
		op.add(Builder::items, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "items");

	}

}
