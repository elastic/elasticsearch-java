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

package co.elastic.clients.elasticsearch.core.search;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.Rescore

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.Rescore">API
 *      specification</a>
 */
@JsonpDeserializable
public class Rescore implements JsonpSerializable {
	private final RescoreQuery query;

	@Nullable
	private final Integer windowSize;

	// ---------------------------------------------------------------------------------------------

	private Rescore(Builder builder) {

		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");
		this.windowSize = builder.windowSize;

	}

	public static Rescore of(Function<Builder, ObjectBuilder<Rescore>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final RescoreQuery query() {
		return this.query;
	}

	/**
	 * API name: {@code window_size}
	 */
	@Nullable
	public final Integer windowSize() {
		return this.windowSize;
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

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

		if (this.windowSize != null) {
			generator.writeKey("window_size");
			generator.write(this.windowSize);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Rescore}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Rescore> {
		private RescoreQuery query;

		@Nullable
		private Integer windowSize;

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(RescoreQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(Function<RescoreQuery.Builder, ObjectBuilder<RescoreQuery>> fn) {
			return this.query(fn.apply(new RescoreQuery.Builder()).build());
		}

		/**
		 * API name: {@code window_size}
		 */
		public final Builder windowSize(@Nullable Integer value) {
			this.windowSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Rescore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Rescore build() {
			_checkSingleUse();

			return new Rescore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Rescore}
	 */
	public static final JsonpDeserializer<Rescore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Rescore::setupRescoreDeserializer);

	protected static void setupRescoreDeserializer(ObjectDeserializer<Rescore.Builder> op) {

		op.add(Builder::query, RescoreQuery._DESERIALIZER, "query");
		op.add(Builder::windowSize, JsonpDeserializer.integerDeserializer(), "window_size");

	}

}
