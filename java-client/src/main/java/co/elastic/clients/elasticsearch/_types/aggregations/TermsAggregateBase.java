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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TermsAggregateBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.TermsAggregateBase">API
 *      specification</a>
 */

public abstract class TermsAggregateBase<TBucket> extends MultiBucketAggregateBase<TBucket> {
	@Nullable
	private final Long docCountErrorUpperBound;

	@Nullable
	private final Long sumOtherDocCount;

	// ---------------------------------------------------------------------------------------------

	protected TermsAggregateBase(AbstractBuilder<TBucket, ?> builder) {
		super(builder);

		this.docCountErrorUpperBound = builder.docCountErrorUpperBound;
		this.sumOtherDocCount = builder.sumOtherDocCount;

	}

	/**
	 * API name: {@code doc_count_error_upper_bound}
	 */
	@Nullable
	public final Long docCountErrorUpperBound() {
		return this.docCountErrorUpperBound;
	}

	/**
	 * API name: {@code sum_other_doc_count}
	 */
	@Nullable
	public final Long sumOtherDocCount() {
		return this.sumOtherDocCount;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.docCountErrorUpperBound != null) {
			generator.writeKey("doc_count_error_upper_bound");
			generator.write(this.docCountErrorUpperBound);

		}
		if (this.sumOtherDocCount != null) {
			generator.writeKey("sum_other_doc_count");
			generator.write(this.sumOtherDocCount);

		}

	}

	public abstract static class AbstractBuilder<TBucket, BuilderT extends AbstractBuilder<TBucket, BuilderT>>
			extends
				MultiBucketAggregateBase.AbstractBuilder<TBucket, BuilderT> {
		@Nullable
		private Long docCountErrorUpperBound;

		@Nullable
		private Long sumOtherDocCount;

		/**
		 * API name: {@code doc_count_error_upper_bound}
		 */
		public final BuilderT docCountErrorUpperBound(@Nullable Long value) {
			this.docCountErrorUpperBound = value;
			return self();
		}

		/**
		 * API name: {@code sum_other_doc_count}
		 */
		public final BuilderT sumOtherDocCount(@Nullable Long value) {
			this.sumOtherDocCount = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <TBucket, BuilderT extends AbstractBuilder<TBucket, BuilderT>> void setupTermsAggregateBaseDeserializer(
			ObjectDeserializer<BuilderT> op, JsonpDeserializer<TBucket> tBucketDeserializer) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, tBucketDeserializer);
		op.add(AbstractBuilder::docCountErrorUpperBound, JsonpDeserializer.longDeserializer(),
				"doc_count_error_upper_bound");
		op.add(AbstractBuilder::sumOtherDocCount, JsonpDeserializer.longDeserializer(), "sum_other_doc_count");

	}

}
