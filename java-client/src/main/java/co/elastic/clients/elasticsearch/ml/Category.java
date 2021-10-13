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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Category
@JsonpDeserializable
public final class Category implements JsonpSerializable {
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

	@Nullable
	private final List<String> preferredToCategories;

	@Nullable
	private final String p;

	private final String resultType;

	private final String mlcategory;

	// ---------------------------------------------------------------------------------------------

	public Category(Builder builder) {

		this.categoryId = Objects.requireNonNull(builder.categoryId, "category_id");
		this.examples = ModelTypeHelper.unmodifiableNonNull(builder.examples, "examples");
		this.grokPattern = builder.grokPattern;
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.maxMatchingLength = Objects.requireNonNull(builder.maxMatchingLength, "max_matching_length");
		this.partitionFieldName = builder.partitionFieldName;
		this.partitionFieldValue = builder.partitionFieldValue;
		this.regex = Objects.requireNonNull(builder.regex, "regex");
		this.terms = Objects.requireNonNull(builder.terms, "terms");
		this.numMatches = builder.numMatches;
		this.preferredToCategories = ModelTypeHelper.unmodifiable(builder.preferredToCategories);
		this.p = builder.p;
		this.resultType = Objects.requireNonNull(builder.resultType, "result_type");
		this.mlcategory = Objects.requireNonNull(builder.mlcategory, "mlcategory");

	}

	public Category(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - A unique identifier for the category. category_id is unique at the
	 * job level, even when per-partition categorization is enabled.
	 * <p>
	 * API name: {@code category_id}
	 */
	public Number categoryId() {
		return this.categoryId;
	}

	/**
	 * Required - A list of examples of actual values that matched the category.
	 * <p>
	 * API name: {@code examples}
	 */
	public List<String> examples() {
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
	public String grokPattern() {
		return this.grokPattern;
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Required - The maximum length of the fields that matched the category. The
	 * value is increased by 10% to enable matching for similar fields that have not
	 * been analyzed.
	 * <p>
	 * API name: {@code max_matching_length}
	 */
	public Number maxMatchingLength() {
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
	public String partitionFieldName() {
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
	public String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * Required - A regular expression that is used to search for values that match
	 * the category.
	 * <p>
	 * API name: {@code regex}
	 */
	public String regex() {
		return this.regex;
	}

	/**
	 * Required - A space separated list of the common tokens that are matched in
	 * values of the category.
	 * <p>
	 * API name: {@code terms}
	 */
	public String terms() {
		return this.terms;
	}

	/**
	 * The number of messages that have been matched by this category. This is only
	 * guaranteed to have the latest accurate count after a job _flush or _close
	 * <p>
	 * API name: {@code num_matches}
	 */
	@Nullable
	public Long numMatches() {
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
	@Nullable
	public List<String> preferredToCategories() {
		return this.preferredToCategories;
	}

	/**
	 * API name: {@code p}
	 */
	@Nullable
	public String p() {
		return this.p;
	}

	/**
	 * Required - API name: {@code result_type}
	 */
	public String resultType() {
		return this.resultType;
	}

	/**
	 * Required - API name: {@code mlcategory}
	 */
	public String mlcategory() {
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

		generator.writeKey("examples");
		generator.writeStartArray();
		for (String item0 : this.examples) {
			generator.write(item0);

		}
		generator.writeEnd();

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
		if (this.preferredToCategories != null) {

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Category}.
	 */
	public static class Builder implements ObjectBuilder<Category> {
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
		public Builder categoryId(Number value) {
			this.categoryId = value;
			return this;
		}

		/**
		 * Required - A list of examples of actual values that matched the category.
		 * <p>
		 * API name: {@code examples}
		 */
		public Builder examples(List<String> value) {
			this.examples = value;
			return this;
		}

		/**
		 * Required - A list of examples of actual values that matched the category.
		 * <p>
		 * API name: {@code examples}
		 */
		public Builder examples(String... value) {
			this.examples = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #examples(List)}, creating the list if needed.
		 */
		public Builder addExamples(String value) {
			if (this.examples == null) {
				this.examples = new ArrayList<>();
			}
			this.examples.add(value);
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
		public Builder grokPattern(@Nullable String value) {
			this.grokPattern = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
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
		public Builder maxMatchingLength(Number value) {
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
		public Builder partitionFieldName(@Nullable String value) {
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
		public Builder partitionFieldValue(@Nullable String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * Required - A regular expression that is used to search for values that match
		 * the category.
		 * <p>
		 * API name: {@code regex}
		 */
		public Builder regex(String value) {
			this.regex = value;
			return this;
		}

		/**
		 * Required - A space separated list of the common tokens that are matched in
		 * values of the category.
		 * <p>
		 * API name: {@code terms}
		 */
		public Builder terms(String value) {
			this.terms = value;
			return this;
		}

		/**
		 * The number of messages that have been matched by this category. This is only
		 * guaranteed to have the latest accurate count after a job _flush or _close
		 * <p>
		 * API name: {@code num_matches}
		 */
		public Builder numMatches(@Nullable Long value) {
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
		 */
		public Builder preferredToCategories(@Nullable List<String> value) {
			this.preferredToCategories = value;
			return this;
		}

		/**
		 * A list of category_id entries that this current category encompasses. Any new
		 * message that is processed by the categorizer will match against this category
		 * and not any of the categories in this list. This is only guaranteed to have
		 * the latest accurate list of categories after a job _flush or _close
		 * <p>
		 * API name: {@code preferred_to_categories}
		 */
		public Builder preferredToCategories(String... value) {
			this.preferredToCategories = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #preferredToCategories(List)}, creating the list if
		 * needed.
		 */
		public Builder addPreferredToCategories(String value) {
			if (this.preferredToCategories == null) {
				this.preferredToCategories = new ArrayList<>();
			}
			this.preferredToCategories.add(value);
			return this;
		}

		/**
		 * API name: {@code p}
		 */
		public Builder p(@Nullable String value) {
			this.p = value;
			return this;
		}

		/**
		 * Required - API name: {@code result_type}
		 */
		public Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - API name: {@code mlcategory}
		 */
		public Builder mlcategory(String value) {
			this.mlcategory = value;
			return this;
		}

		/**
		 * Builds a {@link Category}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Category build() {

			return new Category(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Category}
	 */
	public static final JsonpDeserializer<Category> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Category::setupCategoryDeserializer, Builder::build);

	protected static void setupCategoryDeserializer(DelegatingDeserializer<Category.Builder> op) {

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
