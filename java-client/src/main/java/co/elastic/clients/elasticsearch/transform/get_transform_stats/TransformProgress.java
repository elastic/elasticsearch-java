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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

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
import java.lang.Double;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: transform.get_transform_stats.TransformProgress

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.TransformProgress">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformProgress implements JsonpSerializable {
	private final long docsIndexed;

	private final long docsProcessed;

	private final long docsRemaining;

	private final double percentComplete;

	private final long totalDocs;

	// ---------------------------------------------------------------------------------------------

	private TransformProgress(Builder builder) {

		this.docsIndexed = ApiTypeHelper.requireNonNull(builder.docsIndexed, this, "docsIndexed");
		this.docsProcessed = ApiTypeHelper.requireNonNull(builder.docsProcessed, this, "docsProcessed");
		this.docsRemaining = ApiTypeHelper.requireNonNull(builder.docsRemaining, this, "docsRemaining");
		this.percentComplete = ApiTypeHelper.requireNonNull(builder.percentComplete, this, "percentComplete");
		this.totalDocs = ApiTypeHelper.requireNonNull(builder.totalDocs, this, "totalDocs");

	}

	public static TransformProgress of(Function<Builder, ObjectBuilder<TransformProgress>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code docs_indexed}
	 */
	public final long docsIndexed() {
		return this.docsIndexed;
	}

	/**
	 * Required - API name: {@code docs_processed}
	 */
	public final long docsProcessed() {
		return this.docsProcessed;
	}

	/**
	 * Required - API name: {@code docs_remaining}
	 */
	public final long docsRemaining() {
		return this.docsRemaining;
	}

	/**
	 * Required - API name: {@code percent_complete}
	 */
	public final double percentComplete() {
		return this.percentComplete;
	}

	/**
	 * Required - API name: {@code total_docs}
	 */
	public final long totalDocs() {
		return this.totalDocs;
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

		generator.writeKey("docs_indexed");
		generator.write(this.docsIndexed);

		generator.writeKey("docs_processed");
		generator.write(this.docsProcessed);

		generator.writeKey("docs_remaining");
		generator.write(this.docsRemaining);

		generator.writeKey("percent_complete");
		generator.write(this.percentComplete);

		generator.writeKey("total_docs");
		generator.write(this.totalDocs);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformProgress}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TransformProgress> {
		private Long docsIndexed;

		private Long docsProcessed;

		private Long docsRemaining;

		private Double percentComplete;

		private Long totalDocs;

		/**
		 * Required - API name: {@code docs_indexed}
		 */
		public final Builder docsIndexed(long value) {
			this.docsIndexed = value;
			return this;
		}

		/**
		 * Required - API name: {@code docs_processed}
		 */
		public final Builder docsProcessed(long value) {
			this.docsProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code docs_remaining}
		 */
		public final Builder docsRemaining(long value) {
			this.docsRemaining = value;
			return this;
		}

		/**
		 * Required - API name: {@code percent_complete}
		 */
		public final Builder percentComplete(double value) {
			this.percentComplete = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_docs}
		 */
		public final Builder totalDocs(long value) {
			this.totalDocs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformProgress}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformProgress build() {
			_checkSingleUse();

			return new TransformProgress(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformProgress}
	 */
	public static final JsonpDeserializer<TransformProgress> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformProgress::setupTransformProgressDeserializer);

	protected static void setupTransformProgressDeserializer(ObjectDeserializer<TransformProgress.Builder> op) {

		op.add(Builder::docsIndexed, JsonpDeserializer.longDeserializer(), "docs_indexed");
		op.add(Builder::docsProcessed, JsonpDeserializer.longDeserializer(), "docs_processed");
		op.add(Builder::docsRemaining, JsonpDeserializer.longDeserializer(), "docs_remaining");
		op.add(Builder::percentComplete, JsonpDeserializer.doubleDeserializer(), "percent_complete");
		op.add(Builder::totalDocs, JsonpDeserializer.longDeserializer(), "total_docs");

	}

}
