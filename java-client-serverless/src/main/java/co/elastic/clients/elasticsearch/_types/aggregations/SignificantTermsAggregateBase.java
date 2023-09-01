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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.SignificantTermsAggregateBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.SignificantTermsAggregateBase">API
 *      specification</a>
 */

public abstract class SignificantTermsAggregateBase<T> extends MultiBucketAggregateBase<T> {
	@Nullable
	private final Long bgCount;

	@Nullable
	private final Long docCount;

	@Nullable
	private final JsonpSerializer<T> tSerializer;

	// ---------------------------------------------------------------------------------------------

	protected SignificantTermsAggregateBase(AbstractBuilder<T, ?> builder) {
		super(builder);

		this.bgCount = builder.bgCount;
		this.docCount = builder.docCount;
		this.tSerializer = builder.tSerializer;

	}

	/**
	 * API name: {@code bg_count}
	 */
	@Nullable
	public final Long bgCount() {
		return this.bgCount;
	}

	/**
	 * API name: {@code doc_count}
	 */
	@Nullable
	public final Long docCount() {
		return this.docCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.bgCount != null) {
			generator.writeKey("bg_count");
			generator.write(this.bgCount);

		}
		if (this.docCount != null) {
			generator.writeKey("doc_count");
			generator.write(this.docCount);

		}

	}

	public abstract static class AbstractBuilder<T, BuilderT extends AbstractBuilder<T, BuilderT>>
			extends
				MultiBucketAggregateBase.AbstractBuilder<T, BuilderT> {
		@Nullable
		private Long bgCount;

		@Nullable
		private Long docCount;

		@Nullable
		private JsonpSerializer<T> tSerializer;

		/**
		 * API name: {@code bg_count}
		 */
		public final BuilderT bgCount(@Nullable Long value) {
			this.bgCount = value;
			return self();
		}

		/**
		 * API name: {@code doc_count}
		 */
		public final BuilderT docCount(@Nullable Long value) {
			this.docCount = value;
			return self();
		}

		/**
		 * Serializer for T. If not set, an attempt will be made to find a serializer
		 * from the JSON context.
		 */
		public final BuilderT tSerializer(@Nullable JsonpSerializer<T> value) {
			this.tSerializer = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <T, BuilderT extends AbstractBuilder<T, BuilderT>> void setupSignificantTermsAggregateBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<T> tDeserializer) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, tDeserializer);
		op.add(AbstractBuilder::bgCount, JsonpDeserializer.longDeserializer(), "bg_count");
		op.add(AbstractBuilder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");

	}

}
