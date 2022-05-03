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
import java.lang.Long;
import java.lang.Number;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Category

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Category">API
 *      specification</a>
 */
@JsonpDeserializable
public class Category implements JsonpSerializable {
	private final Number categoryId;

	private final List<String> examples;

	@Nullable
	private final String grokPattern;

	private final String jobId;

	private final Number maxMatchingLength;

	@Nullable
	private final String partitionFieldName;

	@Nullable
	private final String partitionFieldValue;

	private final String regex;

	private final String terms;

	@Nullable
	private final Long numMatches;

	private final List<String> preferredToCategories;

	@Nullable
	private final String p;

	private final String resultType;

	private final String mlcategory;

	// ---------------------------------------------------------------------------------------------

	private Category(Builder builder) {

		this.categoryId = ApiTypeHelper.requireNonNull(builder.categoryId, this, "categoryId");
		this.examples = ApiTypeHelper.unmodifiableRequired(builder.examples, this, "examples");
		this.grokPattern = builder.grokPattern;
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.maxMatchingLength = ApiTypeHelper.requireNonNull(builder.maxMatchingLength, this, "maxMatchingLength");
		this.partitionFieldName = builder.partitionFieldName;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.regex = ApiTypeHelper.requireNonNull(builder.regex, this, "regex");
		this.terms = ApiTypeHelper.requireNonNull(builder.terms, this, "terms");
		this.numMatches = builder.numMatches;
		this.preferredToCategories = ApiTypeHelper.unmodifiable(builder.preferredToCategories);
		this.p = builder.p;
		this.resultType = ApiTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.mlcategory = ApiTypeHelper.requireNonNull(builder.mlcategory, this, "mlcategory");

	}

	public static Category of(Function<Builder, ObjectBuilder<Category>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A unique identifier for the category. category_id is unique at the
	 * job level, even when per-partition categorization is enabled.
	 * <p>
	 * API name: {@code category_id}
	 */
	public final Number categoryId() {
		return this.categoryId;
	}

	/**
	 * Required - A list of examples of actual values that matched the category.
	 * <p>
	 * API name: {@code examples}
	 */
	public final List<String> examples() {
		return this.examples;
	}

	/**
	 * [experimental] A Grok pattern that could be used in Logstash or an ingest
	 * pipeline to extract fields from messages that match the category. This field
	 * is experimental and may be changed or removed in a future release. The Grok
	 * patterns that are found are not optimal, but are often a good starting point
	 * for manual tweaking.
	 * <p>
	 * API name: {@code grok_pattern}
	 */
	@Nullable
	public final String grokPattern() {
		return this.grokPattern;
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - The maximum length of the fields that matched the category. The
	 * value is increased by 10% to enable matching for similar fields that have not
	 * been analyzed.
	 * <p>
	 * API name: {@code max_matching_length}
	 */
	public final Number maxMatchingLength() {
		return this.maxMatchingLength;
	}

	/**
	 * If per-partition categorization is enabled, this property identifies the
	 * field used to segment the categorization. It is not present when
	 * per-partition categorization is disabled.
	 * <p>
	 * API name: {@code partition_field_name}
	 */
	@Nullable
	public final String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * If per-partition categorization is enabled, this property identifies the
	 * value of the partition_field_name for the category. It is not present when
	 * per-partition categorization is disabled.
	 * <p>
	 * API name: {@code partition_field_value}
	 */
	@Nullable
	public final String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * Required - A regular expression that is used to search for values that match
	 * the category.
	 * <p>
	 * API name: {@code regex}
	 */
	public final String regex() {
		return this.regex;
	}

	/**
	 * Required - A space separated list of the common tokens that are matched in
	 * values of the category.
	 * <p>
	 * API name: {@code terms}
	 */
	public final String terms() {
		return this.terms;
	}

	/**
	 * The number of messages that have been matched by this category. This is only
	 * guaranteed to have the latest accurate count after a job _flush or _close
	 * <p>
	 * API name: {@code num_matches}
	 */
	@Nullable
	public final Long numMatches() {
		return this.numMatches;
	}

	/**
	 * A list of category_id entries that this current category encompasses. Any new
	 * message that is processed by the categorizer will match against this category
	 * and not any of the categories in this list. This is only guaranteed to have
	 * the latest accurate list of categories after a job _flush or _close
	 * <p>
	 * API name: {@code preferred_to_categories}
	 */
	public final List<String> preferredToCategories() {
		return this.preferredToCategories;
	}

	/**
	 * API name: {@code p}
	 */
	@Nullable
	public final String p() {
		return this.p;
	}

	/**
	 * Required - API name: {@code result_type}
	 */
	public final String resultType() {
		return this.resultType;
	}

	/**
	 * Required - API name: {@code mlcategory}
	 */
	public final String mlcategory() {
		return this.mlcategory;
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

		generator.writeKey("category_id");
		generator.write(this.categoryId.doubleValue());

		if (ApiTypeHelper.isDefined(this.examples)) {
			generator.writeKey("examples");
			generator.writeStartArray();
			for (String item0 : this.examples) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.grokPattern != null) {
			generator.writeKey("grok_pattern");
			generator.write(this.grokPattern);

		}
		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("max_matching_length");
		generator.write(this.maxMatchingLength.doubleValue());

		if (this.partitionFieldName != null) {
			generator.writeKey("partition_field_name");
			generator.write(this.partitionFieldName);

		}
		if (this.partitionFieldValue != null) {
			generator.writeKey("partition_field_value");
			generator.write(this.partitionFieldValue);

		}
		generator.writeKey("regex");
		generator.write(this.regex);

		generator.writeKey("terms");
		generator.write(this.terms);

		if (this.numMatches != null) {
			generator.writeKey("num_matches");
			generator.write(this.numMatches);

		}
		if (ApiTypeHelper.isDefined(this.preferredToCategories)) {
			generator.writeKey("preferred_to_categories");
			generator.writeStartArray();
			for (String item0 : this.preferredToCategories) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.p != null) {
			generator.writeKey("p");
			generator.write(this.p);

		}
		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("mlcategory");
		generator.write(this.mlcategory);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Category}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Category> {
		private Number categoryId;

		private List<String> examples;

		@Nullable
		private String grokPattern;

		private String jobId;

		private Number maxMatchingLength;

		@Nullable
		private String partitionFieldName;

		@Nullable
		private String partitionFieldValue;

		private String regex;

		private String terms;

		@Nullable
		private Long numMatches;

		@Nullable
		private List<String> preferredToCategories;

		@Nullable
		private String p;

		private String resultType;

		private String mlcategory;

		/**
		 * Required - A unique identifier for the category. category_id is unique at the
		 * job level, even when per-partition categorization is enabled.
		 * <p>
		 * API name: {@code category_id}
		 */
		public final Builder categoryId(Number value) {
			this.categoryId = value;
			return this;
		}

		/**
		 * Required - A list of examples of actual values that matched the category.
		 * <p>
		 * API name: {@code examples}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>examples</code>.
		 */
		public final Builder examples(List<String> list) {
			this.examples = _listAddAll(this.examples, list);
			return this;
		}

		/**
		 * Required - A list of examples of actual values that matched the category.
		 * <p>
		 * API name: {@code examples}
		 * <p>
		 * Adds one or more values to <code>examples</code>.
		 */
		public final Builder examples(String value, String... values) {
			this.examples = _listAdd(this.examples, value, values);
			return this;
		}

		/**
		 * [experimental] A Grok pattern that could be used in Logstash or an ingest
		 * pipeline to extract fields from messages that match the category. This field
		 * is experimental and may be changed or removed in a future release. The Grok
		 * patterns that are found are not optimal, but are often a good starting point
		 * for manual tweaking.
		 * <p>
		 * API name: {@code grok_pattern}
		 */
		public final Builder grokPattern(@Nullable String value) {
			this.grokPattern = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - The maximum length of the fields that matched the category. The
		 * value is increased by 10% to enable matching for similar fields that have not
		 * been analyzed.
		 * <p>
		 * API name: {@code max_matching_length}
		 */
		public final Builder maxMatchingLength(Number value) {
			this.maxMatchingLength = value;
			return this;
		}

		/**
		 * If per-partition categorization is enabled, this property identifies the
		 * field used to segment the categorization. It is not present when
		 * per-partition categorization is disabled.
		 * <p>
		 * API name: {@code partition_field_name}
		 */
		public final Builder partitionFieldName(@Nullable String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * If per-partition categorization is enabled, this property identifies the
		 * value of the partition_field_name for the category. It is not present when
		 * per-partition categorization is disabled.
		 * <p>
		 * API name: {@code partition_field_value}
		 */
		public final Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * Required - A regular expression that is used to search for values that match
		 * the category.
		 * <p>
		 * API name: {@code regex}
		 */
		public final Builder regex(String value) {
			this.regex = value;
			return this;
		}

		/**
		 * Required - A space separated list of the common tokens that are matched in
		 * values of the category.
		 * <p>
		 * API name: {@code terms}
		 */
		public final Builder terms(String value) {
			this.terms = value;
			return this;
		}

		/**
		 * The number of messages that have been matched by this category. This is only
		 * guaranteed to have the latest accurate count after a job _flush or _close
		 * <p>
		 * API name: {@code num_matches}
		 */
		public final Builder numMatches(@Nullable Long value) {
			this.numMatches = value;
			return this;
		}

		/**
		 * A list of category_id entries that this current category encompasses. Any new
		 * message that is processed by the categorizer will match against this category
		 * and not any of the categories in this list. This is only guaranteed to have
		 * the latest accurate list of categories after a job _flush or _close
		 * <p>
		 * API name: {@code preferred_to_categories}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>preferredToCategories</code>.
		 */
		public final Builder preferredToCategories(List<String> list) {
			this.preferredToCategories = _listAddAll(this.preferredToCategories, list);
			return this;
		}

		/**
		 * A list of category_id entries that this current category encompasses. Any new
		 * message that is processed by the categorizer will match against this category
		 * and not any of the categories in this list. This is only guaranteed to have
		 * the latest accurate list of categories after a job _flush or _close
		 * <p>
		 * API name: {@code preferred_to_categories}
		 * <p>
		 * Adds one or more values to <code>preferredToCategories</code>.
		 */
		public final Builder preferredToCategories(String value, String... values) {
			this.preferredToCategories = _listAdd(this.preferredToCategories, value, values);
			return this;
		}

		/**
		 * API name: {@code p}
		 */
		public final Builder p(@Nullable String value) {
			this.p = value;
			return this;
		}

		/**
		 * Required - API name: {@code result_type}
		 */
		public final Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - API name: {@code mlcategory}
		 */
		public final Builder mlcategory(String value) {
			this.mlcategory = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Category}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Category build() {
			_checkSingleUse();

			return new Category(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Category}
	 */
	public static final JsonpDeserializer<Category> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Category::setupCategoryDeserializer);

	protected static void setupCategoryDeserializer(ObjectDeserializer<Category.Builder> op) {

		op.add(Builder::categoryId, JsonpDeserializer.numberDeserializer(), "category_id");
		op.add(Builder::examples, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"examples");
		op.add(Builder::grokPattern, JsonpDeserializer.stringDeserializer(), "grok_pattern");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::maxMatchingLength, JsonpDeserializer.numberDeserializer(), "max_matching_length");
		op.add(Builder::partitionFieldName, JsonpDeserializer.stringDeserializer(), "partition_field_name");
		op.add(Builder::partitionFieldValue, JsonpDeserializer.stringDeserializer(), "partition_field_value");
		op.add(Builder::regex, JsonpDeserializer.stringDeserializer(), "regex");
		op.add(Builder::terms, JsonpDeserializer.stringDeserializer(), "terms");
		op.add(Builder::numMatches, JsonpDeserializer.longDeserializer(), "num_matches");
		op.add(Builder::preferredToCategories,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "preferred_to_categories");
		op.add(Builder::p, JsonpDeserializer.stringDeserializer(), "p");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::mlcategory, JsonpDeserializer.stringDeserializer(), "mlcategory");

	}

}
