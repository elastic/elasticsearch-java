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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.InnerHitsMetadata
@JsonpDeserializable
public class InnerHitsMetadata implements JsonpSerializable {
	private final JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ total;

	private final List<Hit<Map<String, JsonData>>> hits;

	@Nullable
	private final Double maxScore;

	// ---------------------------------------------------------------------------------------------

	private InnerHitsMetadata(Builder builder) {

		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.hits = ModelTypeHelper.unmodifiableRequired(builder.hits, this, "hits");
		this.maxScore = builder.maxScore;

	}

	public static InnerHitsMetadata of(Function<Builder, ObjectBuilder<InnerHitsMetadata>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public final List<Hit<Map<String, JsonData>>> hits() {
		return this.hits;
	}

	/**
	 * API name: {@code max_score}
	 */
	@Nullable
	public final Double maxScore() {
		return this.maxScore;
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

		generator.writeKey("total");
		generator.write(this.total);

		if (ModelTypeHelper.isDefined(this.hits)) {
			generator.writeKey("hits");
			generator.writeStartArray();
			for (Hit<Map<String, JsonData>> item0 : this.hits) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxScore != null) {
			generator.writeKey("max_score");
			generator.write(this.maxScore);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InnerHitsMetadata}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<InnerHitsMetadata> {
		private JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ total;

		private List<Hit<Map<String, JsonData>>> hits;

		@Nullable
		private Double maxScore;

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(JsonValue /* Union(_global.search._types.TotalHits | _types.long) */ value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public final Builder hits(List<Hit<Map<String, JsonData>>> value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public final Builder hits(Hit<Map<String, JsonData>>... value) {
			this.hits = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		@SafeVarargs
		public final Builder hits(
				Function<Hit.Builder<Map<String, JsonData>>, ObjectBuilder<Hit<Map<String, JsonData>>>>... fns) {
			this.hits = new ArrayList<>(fns.length);
			for (Function<Hit.Builder<Map<String, JsonData>>, ObjectBuilder<Hit<Map<String, JsonData>>>> fn : fns) {
				this.hits.add(fn.apply(new Hit.Builder<Map<String, JsonData>>()).build());
			}
			return this;
		}

		/**
		 * API name: {@code max_score}
		 */
		public final Builder maxScore(@Nullable Double value) {
			this.maxScore = value;
			return this;
		}

		/**
		 * Builds a {@link InnerHitsMetadata}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InnerHitsMetadata build() {
			_checkSingleUse();

			return new InnerHitsMetadata(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InnerHitsMetadata}
	 */
	public static final JsonpDeserializer<InnerHitsMetadata> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InnerHitsMetadata::setupInnerHitsMetadataDeserializer, Builder::build);

	protected static void setupInnerHitsMetadataDeserializer(DelegatingDeserializer<InnerHitsMetadata.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.jsonValueDeserializer(), "total");
		op.add(Builder::hits,
				JsonpDeserializer.arrayDeserializer(
						Hit.createHitDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER))),
				"hits");
		op.add(Builder::maxScore, JsonpDeserializer.doubleDeserializer(), "max_score");

	}

}
