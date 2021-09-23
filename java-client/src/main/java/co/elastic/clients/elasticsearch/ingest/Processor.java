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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.ProcessorContainer
public class Processor extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String ATTACHMENT = "attachment";
	public static final String APPEND = "append";
	public static final String CSV = "csv";
	public static final String CONVERT = "convert";
	public static final String DATE = "date";
	public static final String DATE_INDEX_NAME = "date_index_name";
	public static final String DOT_EXPANDER = "dot_expander";
	public static final String ENRICH = "enrich";
	public static final String FAIL = "fail";
	public static final String FOREACH = "foreach";
	public static final String JSON = "json";
	public static final String USER_AGENT = "user_agent";
	public static final String KV = "kv";
	public static final String GEOIP = "geoip";
	public static final String GROK = "grok";
	public static final String GSUB = "gsub";
	public static final String JOIN = "join";
	public static final String LOWERCASE = "lowercase";
	public static final String REMOVE = "remove";
	public static final String RENAME = "rename";
	public static final String SCRIPT = "script";
	public static final String SET = "set";
	public static final String SORT = "sort";
	public static final String SPLIT = "split";
	public static final String TRIM = "trim";
	public static final String UPPERCASE = "uppercase";
	public static final String URLDECODE = "urldecode";
	public static final String BYTES = "bytes";
	public static final String DISSECT = "dissect";
	public static final String SET_SECURITY_USER = "set_security_user";
	public static final String PIPELINE = "pipeline";
	public static final String DROP = "drop";
	public static final String CIRCLE = "circle";
	public static final String INFERENCE = "inference";

	private Processor(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code attachment} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code attachment} kind.
	 */
	public AttachmentProcessor attachment() {
		return _get(ATTACHMENT);
	}

	/**
	 * Get the {@code append} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code append} kind.
	 */
	public AppendProcessor append() {
		return _get(APPEND);
	}

	/**
	 * Get the {@code csv} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code csv} kind.
	 */
	public CsvProcessor csv() {
		return _get(CSV);
	}

	/**
	 * Get the {@code convert} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code convert} kind.
	 */
	public ConvertProcessor convert() {
		return _get(CONVERT);
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public DateProcessor date() {
		return _get(DATE);
	}

	/**
	 * Get the {@code date_index_name} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date_index_name}
	 *             kind.
	 */
	public DateIndexNameProcessor dateIndexName() {
		return _get(DATE_INDEX_NAME);
	}

	/**
	 * Get the {@code dot_expander} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dot_expander} kind.
	 */
	public DotExpanderProcessor dotExpander() {
		return _get(DOT_EXPANDER);
	}

	/**
	 * Get the {@code enrich} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code enrich} kind.
	 */
	public EnrichProcessor enrich() {
		return _get(ENRICH);
	}

	/**
	 * Get the {@code fail} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fail} kind.
	 */
	public FailProcessor fail() {
		return _get(FAIL);
	}

	/**
	 * Get the {@code foreach} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code foreach} kind.
	 */
	public ForeachProcessor foreach() {
		return _get(FOREACH);
	}

	/**
	 * Get the {@code json} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code json} kind.
	 */
	public JsonProcessor json() {
		return _get(JSON);
	}

	/**
	 * Get the {@code user_agent} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code user_agent} kind.
	 */
	public UserAgentProcessor userAgent() {
		return _get(USER_AGENT);
	}

	/**
	 * Get the {@code kv} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code kv} kind.
	 */
	public KeyValueProcessor kv() {
		return _get(KV);
	}

	/**
	 * Get the {@code geoip} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code geoip} kind.
	 */
	public GeoIpProcessor geoip() {
		return _get(GEOIP);
	}

	/**
	 * Get the {@code grok} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code grok} kind.
	 */
	public GrokProcessor grok() {
		return _get(GROK);
	}

	/**
	 * Get the {@code gsub} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gsub} kind.
	 */
	public GsubProcessor gsub() {
		return _get(GSUB);
	}

	/**
	 * Get the {@code join} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code join} kind.
	 */
	public JoinProcessor join() {
		return _get(JOIN);
	}

	/**
	 * Get the {@code lowercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lowercase} kind.
	 */
	public LowercaseProcessor lowercase() {
		return _get(LOWERCASE);
	}

	/**
	 * Get the {@code remove} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code remove} kind.
	 */
	public RemoveProcessor remove() {
		return _get(REMOVE);
	}

	/**
	 * Get the {@code rename} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code rename} kind.
	 */
	public RenameProcessor rename() {
		return _get(RENAME);
	}

	/**
	 * Get the {@code script} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script} kind.
	 */
	public JsonValue script() {
		return _get(SCRIPT);
	}

	/**
	 * Get the {@code set} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code set} kind.
	 */
	public SetProcessor set() {
		return _get(SET);
	}

	/**
	 * Get the {@code sort} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code sort} kind.
	 */
	public SortProcessor sort() {
		return _get(SORT);
	}

	/**
	 * Get the {@code split} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code split} kind.
	 */
	public SplitProcessor split() {
		return _get(SPLIT);
	}

	/**
	 * Get the {@code trim} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code trim} kind.
	 */
	public TrimProcessor trim() {
		return _get(TRIM);
	}

	/**
	 * Get the {@code uppercase} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code uppercase} kind.
	 */
	public UppercaseProcessor uppercase() {
		return _get(UPPERCASE);
	}

	/**
	 * Get the {@code urldecode} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code urldecode} kind.
	 */
	public UrlDecodeProcessor urldecode() {
		return _get(URLDECODE);
	}

	/**
	 * Get the {@code bytes} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bytes} kind.
	 */
	public BytesProcessor bytes() {
		return _get(BYTES);
	}

	/**
	 * Get the {@code dissect} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dissect} kind.
	 */
	public DissectProcessor dissect() {
		return _get(DISSECT);
	}

	/**
	 * Get the {@code set_security_user} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code set_security_user}
	 *             kind.
	 */
	public SetSecurityUserProcessor setSecurityUser() {
		return _get(SET_SECURITY_USER);
	}

	/**
	 * Get the {@code pipeline} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pipeline} kind.
	 */
	public PipelineProcessor pipeline() {
		return _get(PIPELINE);
	}

	/**
	 * Get the {@code drop} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code drop} kind.
	 */
	public DropProcessor drop() {
		return _get(DROP);
	}

	/**
	 * Get the {@code circle} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code circle} kind.
	 */
	public CircleProcessor circle() {
		return _get(CIRCLE);
	}

	/**
	 * Get the {@code inference} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference} kind.
	 */
	public InferenceProcessor inference() {
		return _get(INFERENCE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case SCRIPT :
					generator.write(this.<JsonValue>_get(SCRIPT));

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<Processor> attachment(AttachmentProcessor v) {
			this.$variant = v;
			this.$tag = ATTACHMENT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> attachment(
				Function<AttachmentProcessor.Builder, ObjectBuilder<AttachmentProcessor>> f) {
			return this.attachment(f.apply(new AttachmentProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> append(AppendProcessor v) {
			this.$variant = v;
			this.$tag = APPEND;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> append(Function<AppendProcessor.Builder, ObjectBuilder<AppendProcessor>> f) {
			return this.append(f.apply(new AppendProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> csv(CsvProcessor v) {
			this.$variant = v;
			this.$tag = CSV;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> csv(Function<CsvProcessor.Builder, ObjectBuilder<CsvProcessor>> f) {
			return this.csv(f.apply(new CsvProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> convert(ConvertProcessor v) {
			this.$variant = v;
			this.$tag = CONVERT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> convert(Function<ConvertProcessor.Builder, ObjectBuilder<ConvertProcessor>> f) {
			return this.convert(f.apply(new ConvertProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> date(DateProcessor v) {
			this.$variant = v;
			this.$tag = DATE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> date(Function<DateProcessor.Builder, ObjectBuilder<DateProcessor>> f) {
			return this.date(f.apply(new DateProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> dateIndexName(DateIndexNameProcessor v) {
			this.$variant = v;
			this.$tag = DATE_INDEX_NAME;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> dateIndexName(
				Function<DateIndexNameProcessor.Builder, ObjectBuilder<DateIndexNameProcessor>> f) {
			return this.dateIndexName(f.apply(new DateIndexNameProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> dotExpander(DotExpanderProcessor v) {
			this.$variant = v;
			this.$tag = DOT_EXPANDER;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> dotExpander(
				Function<DotExpanderProcessor.Builder, ObjectBuilder<DotExpanderProcessor>> f) {
			return this.dotExpander(f.apply(new DotExpanderProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> enrich(EnrichProcessor v) {
			this.$variant = v;
			this.$tag = ENRICH;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> enrich(Function<EnrichProcessor.Builder, ObjectBuilder<EnrichProcessor>> f) {
			return this.enrich(f.apply(new EnrichProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> fail(FailProcessor v) {
			this.$variant = v;
			this.$tag = FAIL;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> fail(Function<FailProcessor.Builder, ObjectBuilder<FailProcessor>> f) {
			return this.fail(f.apply(new FailProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> foreach(ForeachProcessor v) {
			this.$variant = v;
			this.$tag = FOREACH;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> foreach(Function<ForeachProcessor.Builder, ObjectBuilder<ForeachProcessor>> f) {
			return this.foreach(f.apply(new ForeachProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> json(JsonProcessor v) {
			this.$variant = v;
			this.$tag = JSON;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> json(Function<JsonProcessor.Builder, ObjectBuilder<JsonProcessor>> f) {
			return this.json(f.apply(new JsonProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> userAgent(UserAgentProcessor v) {
			this.$variant = v;
			this.$tag = USER_AGENT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> userAgent(
				Function<UserAgentProcessor.Builder, ObjectBuilder<UserAgentProcessor>> f) {
			return this.userAgent(f.apply(new UserAgentProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> kv(KeyValueProcessor v) {
			this.$variant = v;
			this.$tag = KV;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> kv(Function<KeyValueProcessor.Builder, ObjectBuilder<KeyValueProcessor>> f) {
			return this.kv(f.apply(new KeyValueProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> geoip(GeoIpProcessor v) {
			this.$variant = v;
			this.$tag = GEOIP;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> geoip(Function<GeoIpProcessor.Builder, ObjectBuilder<GeoIpProcessor>> f) {
			return this.geoip(f.apply(new GeoIpProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> grok(GrokProcessor v) {
			this.$variant = v;
			this.$tag = GROK;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> grok(Function<GrokProcessor.Builder, ObjectBuilder<GrokProcessor>> f) {
			return this.grok(f.apply(new GrokProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> gsub(GsubProcessor v) {
			this.$variant = v;
			this.$tag = GSUB;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> gsub(Function<GsubProcessor.Builder, ObjectBuilder<GsubProcessor>> f) {
			return this.gsub(f.apply(new GsubProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> join(JoinProcessor v) {
			this.$variant = v;
			this.$tag = JOIN;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> join(Function<JoinProcessor.Builder, ObjectBuilder<JoinProcessor>> f) {
			return this.join(f.apply(new JoinProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> lowercase(LowercaseProcessor v) {
			this.$variant = v;
			this.$tag = LOWERCASE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> lowercase(
				Function<LowercaseProcessor.Builder, ObjectBuilder<LowercaseProcessor>> f) {
			return this.lowercase(f.apply(new LowercaseProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> remove(RemoveProcessor v) {
			this.$variant = v;
			this.$tag = REMOVE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> remove(Function<RemoveProcessor.Builder, ObjectBuilder<RemoveProcessor>> f) {
			return this.remove(f.apply(new RemoveProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> rename(RenameProcessor v) {
			this.$variant = v;
			this.$tag = RENAME;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> rename(Function<RenameProcessor.Builder, ObjectBuilder<RenameProcessor>> f) {
			return this.rename(f.apply(new RenameProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> script(JsonValue v) {
			this.$variant = v;
			this.$tag = SCRIPT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> set(SetProcessor v) {
			this.$variant = v;
			this.$tag = SET;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> set(Function<SetProcessor.Builder, ObjectBuilder<SetProcessor>> f) {
			return this.set(f.apply(new SetProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> sort(SortProcessor v) {
			this.$variant = v;
			this.$tag = SORT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> sort(Function<SortProcessor.Builder, ObjectBuilder<SortProcessor>> f) {
			return this.sort(f.apply(new SortProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> split(SplitProcessor v) {
			this.$variant = v;
			this.$tag = SPLIT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> split(Function<SplitProcessor.Builder, ObjectBuilder<SplitProcessor>> f) {
			return this.split(f.apply(new SplitProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> trim(TrimProcessor v) {
			this.$variant = v;
			this.$tag = TRIM;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> trim(Function<TrimProcessor.Builder, ObjectBuilder<TrimProcessor>> f) {
			return this.trim(f.apply(new TrimProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> uppercase(UppercaseProcessor v) {
			this.$variant = v;
			this.$tag = UPPERCASE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> uppercase(
				Function<UppercaseProcessor.Builder, ObjectBuilder<UppercaseProcessor>> f) {
			return this.uppercase(f.apply(new UppercaseProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> urldecode(UrlDecodeProcessor v) {
			this.$variant = v;
			this.$tag = URLDECODE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> urldecode(
				Function<UrlDecodeProcessor.Builder, ObjectBuilder<UrlDecodeProcessor>> f) {
			return this.urldecode(f.apply(new UrlDecodeProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> bytes(BytesProcessor v) {
			this.$variant = v;
			this.$tag = BYTES;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> bytes(Function<BytesProcessor.Builder, ObjectBuilder<BytesProcessor>> f) {
			return this.bytes(f.apply(new BytesProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> dissect(DissectProcessor v) {
			this.$variant = v;
			this.$tag = DISSECT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> dissect(Function<DissectProcessor.Builder, ObjectBuilder<DissectProcessor>> f) {
			return this.dissect(f.apply(new DissectProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> setSecurityUser(SetSecurityUserProcessor v) {
			this.$variant = v;
			this.$tag = SET_SECURITY_USER;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> setSecurityUser(
				Function<SetSecurityUserProcessor.Builder, ObjectBuilder<SetSecurityUserProcessor>> f) {
			return this.setSecurityUser(f.apply(new SetSecurityUserProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> pipeline(PipelineProcessor v) {
			this.$variant = v;
			this.$tag = PIPELINE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> pipeline(
				Function<PipelineProcessor.Builder, ObjectBuilder<PipelineProcessor>> f) {
			return this.pipeline(f.apply(new PipelineProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> drop(DropProcessor v) {
			this.$variant = v;
			this.$tag = DROP;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> drop(Function<DropProcessor.Builder, ObjectBuilder<DropProcessor>> f) {
			return this.drop(f.apply(new DropProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> circle(CircleProcessor v) {
			this.$variant = v;
			this.$tag = CIRCLE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> circle(Function<CircleProcessor.Builder, ObjectBuilder<CircleProcessor>> f) {
			return this.circle(f.apply(new CircleProcessor.Builder()).build());
		}

		public ObjectBuilder<Processor> inference(InferenceProcessor v) {
			this.$variant = v;
			this.$tag = INFERENCE;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Processor> inference(
				Function<InferenceProcessor.Builder, ObjectBuilder<InferenceProcessor>> f) {
			return this.inference(f.apply(new InferenceProcessor.Builder()).build());
		}

		protected Processor build() {
			return new Processor(this);
		}

	}

	protected static void setupProcessorDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::attachment, AttachmentProcessor.DESERIALIZER, "attachment");
		op.add(Builder::append, AppendProcessor.DESERIALIZER, "append");
		op.add(Builder::csv, CsvProcessor.DESERIALIZER, "csv");
		op.add(Builder::convert, ConvertProcessor.DESERIALIZER, "convert");
		op.add(Builder::date, DateProcessor.DESERIALIZER, "date");
		op.add(Builder::dateIndexName, DateIndexNameProcessor.DESERIALIZER, "date_index_name");
		op.add(Builder::dotExpander, DotExpanderProcessor.DESERIALIZER, "dot_expander");
		op.add(Builder::enrich, EnrichProcessor.DESERIALIZER, "enrich");
		op.add(Builder::fail, FailProcessor.DESERIALIZER, "fail");
		op.add(Builder::foreach, ForeachProcessor.DESERIALIZER, "foreach");
		op.add(Builder::json, JsonProcessor.DESERIALIZER, "json");
		op.add(Builder::userAgent, UserAgentProcessor.DESERIALIZER, "user_agent");
		op.add(Builder::kv, KeyValueProcessor.DESERIALIZER, "kv");
		op.add(Builder::geoip, GeoIpProcessor.DESERIALIZER, "geoip");
		op.add(Builder::grok, GrokProcessor.DESERIALIZER, "grok");
		op.add(Builder::gsub, GsubProcessor.DESERIALIZER, "gsub");
		op.add(Builder::join, JoinProcessor.DESERIALIZER, "join");
		op.add(Builder::lowercase, LowercaseProcessor.DESERIALIZER, "lowercase");
		op.add(Builder::remove, RemoveProcessor.DESERIALIZER, "remove");
		op.add(Builder::rename, RenameProcessor.DESERIALIZER, "rename");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::set, SetProcessor.DESERIALIZER, "set");
		op.add(Builder::sort, SortProcessor.DESERIALIZER, "sort");
		op.add(Builder::split, SplitProcessor.DESERIALIZER, "split");
		op.add(Builder::trim, TrimProcessor.DESERIALIZER, "trim");
		op.add(Builder::uppercase, UppercaseProcessor.DESERIALIZER, "uppercase");
		op.add(Builder::urldecode, UrlDecodeProcessor.DESERIALIZER, "urldecode");
		op.add(Builder::bytes, BytesProcessor.DESERIALIZER, "bytes");
		op.add(Builder::dissect, DissectProcessor.DESERIALIZER, "dissect");
		op.add(Builder::setSecurityUser, SetSecurityUserProcessor.DESERIALIZER, "set_security_user");
		op.add(Builder::pipeline, PipelineProcessor.DESERIALIZER, "pipeline");
		op.add(Builder::drop, DropProcessor.DESERIALIZER, "drop");
		op.add(Builder::circle, CircleProcessor.DESERIALIZER, "circle");
		op.add(Builder::inference, InferenceProcessor.DESERIALIZER, "inference");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<Processor> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Processor::setupProcessorDeserializer, Builder::build);
}
