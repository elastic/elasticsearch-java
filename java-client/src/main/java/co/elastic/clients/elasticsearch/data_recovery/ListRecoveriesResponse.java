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

package co.elastic.clients.elasticsearch.data_recovery;

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
import java.util.List;
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

// typedef: data_recovery.list_recoveries.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.list_recoveries.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ListRecoveriesResponse implements JsonpSerializable {
	private final List<Recovery> recoveries;

	private final boolean hasMore;

	// ---------------------------------------------------------------------------------------------

	private ListRecoveriesResponse(Builder builder) {

		this.recoveries = ApiTypeHelper.unmodifiableRequired(builder.recoveries, this, "recoveries");
		this.hasMore = ApiTypeHelper.requireNonNull(builder.hasMore, this, "hasMore", false);

	}

	public static ListRecoveriesResponse of(Function<Builder, ObjectBuilder<ListRecoveriesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The recoveries, in the requested order.
	 * <p>
	 * API name: {@code recoveries}
	 */
	public final List<Recovery> recoveries() {
		return this.recoveries;
	}

	/**
	 * Required - Whether there are more recoveries after the last one in this page.
	 * <p>
	 * API name: {@code has_more}
	 */
	public final boolean hasMore() {
		return this.hasMore;
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

		if (ApiTypeHelper.isDefined(this.recoveries)) {
			generator.writeKey("recoveries");
			generator.writeStartArray();
			for (Recovery item0 : this.recoveries) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("has_more");
		generator.write(this.hasMore);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListRecoveriesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ListRecoveriesResponse> {
		private List<Recovery> recoveries;

		private Boolean hasMore;

		/**
		 * Required - The recoveries, in the requested order.
		 * <p>
		 * API name: {@code recoveries}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>recoveries</code>.
		 */
		public final Builder recoveries(List<Recovery> list) {
			this.recoveries = _listAddAll(this.recoveries, list);
			return this;
		}

		/**
		 * Required - The recoveries, in the requested order.
		 * <p>
		 * API name: {@code recoveries}
		 * <p>
		 * Adds one or more values to <code>recoveries</code>.
		 */
		public final Builder recoveries(Recovery value, Recovery... values) {
			this.recoveries = _listAdd(this.recoveries, value, values);
			return this;
		}

		/**
		 * Required - The recoveries, in the requested order.
		 * <p>
		 * API name: {@code recoveries}
		 * <p>
		 * Adds a value to <code>recoveries</code> using a builder lambda.
		 */
		public final Builder recoveries(Function<Recovery.Builder, ObjectBuilder<Recovery>> fn) {
			return recoveries(fn.apply(new Recovery.Builder()).build());
		}

		/**
		 * Required - Whether there are more recoveries after the last one in this page.
		 * <p>
		 * API name: {@code has_more}
		 */
		public final Builder hasMore(boolean value) {
			this.hasMore = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListRecoveriesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListRecoveriesResponse build() {
			_checkSingleUse();

			return new ListRecoveriesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ListRecoveriesResponse}
	 */
	public static final JsonpDeserializer<ListRecoveriesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ListRecoveriesResponse::setupListRecoveriesResponseDeserializer);

	protected static void setupListRecoveriesResponseDeserializer(
			ObjectDeserializer<ListRecoveriesResponse.Builder> op) {

		op.add(Builder::recoveries, JsonpDeserializer.arrayDeserializer(Recovery._DESERIALIZER), "recoveries");
		op.add(Builder::hasMore, JsonpDeserializer.booleanDeserializer(), "has_more");

	}

}
