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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.query_watches.Response
@JsonpDeserializable
public class QueryWatchesResponse implements JsonpSerializable {
	private final int count;

	private final List<QueryWatch> watches;

	// ---------------------------------------------------------------------------------------------

	private QueryWatchesResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.watches = ModelTypeHelper.unmodifiableRequired(builder.watches, this, "watches");

	}

	public static QueryWatchesResponse of(Function<Builder, ObjectBuilder<QueryWatchesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code watches}
	 */
	public final List<QueryWatch> watches() {
		return this.watches;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ModelTypeHelper.isDefined(this.watches)) {
			generator.writeKey("watches");
			generator.writeStartArray();
			for (QueryWatch item0 : this.watches) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryWatchesResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<QueryWatchesResponse> {
		private Integer count;

		private List<QueryWatch> watches;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code watches}
		 */
		public final Builder watches(List<QueryWatch> value) {
			this.watches = value;
			return this;
		}

		/**
		 * Required - API name: {@code watches}
		 */
		public final Builder watches(QueryWatch... value) {
			this.watches = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code watches}
		 */
		@SafeVarargs
		public final Builder watches(Function<QueryWatch.Builder, ObjectBuilder<QueryWatch>>... fns) {
			this.watches = new ArrayList<>(fns.length);
			for (Function<QueryWatch.Builder, ObjectBuilder<QueryWatch>> fn : fns) {
				this.watches.add(fn.apply(new QueryWatch.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link QueryWatchesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryWatchesResponse build() {
			_checkSingleUse();

			return new QueryWatchesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryWatchesResponse}
	 */
	public static final JsonpDeserializer<QueryWatchesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryWatchesResponse::setupQueryWatchesResponseDeserializer, Builder::build);

	protected static void setupQueryWatchesResponseDeserializer(
			DelegatingDeserializer<QueryWatchesResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::watches, JsonpDeserializer.arrayDeserializer(QueryWatch._DESERIALIZER), "watches");

	}

}
